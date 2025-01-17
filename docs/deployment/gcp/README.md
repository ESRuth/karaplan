# Google Cloud Platform (GCP)

This directory contains specific deployment instructions and examples for [Google Cloud Platform (GCP)](https://cloud.google.com):

1. [**Build**](build): using [Cloud Build](https://cloud.google.com/cloud-build/) to build and push a WAR file to [Cloud Storage](https://cloud.google.com/storage/), and a Docker image to [Container Registry](https://cloud.google.com/container-registry/).
2. [**SQL**](sql): using [Cloud SQL](https://cloud.google.com/sql/) to deploy a database for persistence.
2. [**Memorystore**](memorystore): using [Cloud Memorystore](https://cloud.google.com/memorystore/) to deploy a Redis instance for distributed caching.
3. [**GCE Classic**](gce-classic): using [Compute Engine](https://cloud.google.com/compute/) to run the WAR file with a Tomcat application server in a Managed Instance Group, and [HTTPS Load Balancing](https://cloud.google.com/load-balancing/) to expose the service.
4. [**GCE Container**](gce-container): using [Compute Engine](https://cloud.google.com/compute/) to run the Docker image in a Managed Instance Group, and [HTTPS Load Balancing](https://cloud.google.com/load-balancing/) to expose the service.
5. [**GKE**](gke): using [Kubernetes Engine](https://cloud.google.com/kubernetes-engine/) to run the Docker image in a Kubernetes cluster, and an Ingress to expose the service over HTTPS.
6. [**GAE**](gae): using [App Engine](https://cloud.google.com/appengine/) to run the application and expose the service over HTTPS.
7. [**Cloud Run**](cloudrun): using [Cloud Run](https://cloud.google.com/run) to run the Docker image and expose the service over HTTPS.
