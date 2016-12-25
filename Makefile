all:
	mvn package
	java -jar target/Panally-1.0-SNAPSHOT.jar server config/config.yaml