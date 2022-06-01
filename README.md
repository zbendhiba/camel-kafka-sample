# camel-kafka-sample

[code with CRW](https://workspaces.openshift.com/#https://github.com/zbendhiba/camel-kafka-sample)

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: [https://quarkus.io](https://quarkus.io).

## Camel Components 

* camel-quarkus-kafka
* camel-quarkus-timer

## Packaging and running the application

The application can be packaged using

	./mvnw clean package -Pdocker

The application can now be run using 

	# Run all images
	docker-compose -f etc/compose/camelkafka-compose.yml up --detach && docker logs -f camel
	
	# Stop all images
	docker-compose -f etc/compose/camelkafka-compose.yml down --remove-orphans


## Deploy on OpenShift

You can build, deploy and run this example by pushing it to your [OpenShift Sandbox](https://developers.redhat.com/developer-sandbox) like this ...

	# Deploy the devfile
    odo push
    
    # Delete the deployment
    odo delete -f

or
 
	# Apply k8s deplyment script
	oc apply -f etc/k8s/ticker2log-deployment.yaml  
	
When you then view the log of the running Pod, you should see output like this ...

