package me.crespel.karaplan.web.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import me.crespel.karaplan.domain.User;
import me.crespel.karaplan.model.exception.BusinessException;
import me.crespel.karaplan.security.UserWrapper;
import me.crespel.karaplan.service.UserService;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping(value = "/api/v1/account", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = "account", description = "Account management")
public class AccountController {

	@Autowired
	protected UserService userService;

	@GetMapping("/authentication")
	@ApiOperation("Get authentication info")
	public Authentication getAuthentication(@ApiIgnore Authentication auth) {
		return auth;
	}

	@GetMapping("/principal")
	@ApiOperation("Get the authenticated principal")
	public UserWrapper getPrincipal(@ApiIgnore @AuthenticationPrincipal Object principal) {
		if (principal instanceof UserWrapper) {
			return (UserWrapper) principal;
		} else {
			return null;
		}
	}

	@GetMapping("/user")
	@ApiOperation("Get the authenticated user")
	public User getUser(@ApiIgnore @AuthenticationPrincipal Object principal) {
		if (principal instanceof UserWrapper) {
			return ((UserWrapper) principal).getUser();
		} else {
			return null;
		}
	}

	@PostMapping("/user")
	@ApiOperation("Update the authenticated user")
	public User updateUser(@RequestBody User user, @ApiIgnore @AuthenticationPrincipal Object principal) {
		if (principal instanceof UserWrapper) {
			User userToUpdate = ((UserWrapper) principal).getUser();
			userToUpdate.setDisplayName(user.getDisplayName());
			return userService.save(userToUpdate);
		} else {
			throw new BusinessException("Authentication is required");
		}
	}

	@DeleteMapping("/user")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@ApiOperation("Delete the authenticated user")
	public void deleteUser(@RequestParam(required = false, defaultValue = "false") boolean deleteComments, @ApiIgnore @AuthenticationPrincipal Object principal) {
		if (principal instanceof UserWrapper) {
			User userToDelete = ((UserWrapper) principal).getUser();
			userService.delete(userToDelete, deleteComments);
		} else {
			throw new BusinessException("Authentication is required"); 
		}
	}
	
}
