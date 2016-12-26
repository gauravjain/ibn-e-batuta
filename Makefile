run:
	mvn package
	java -jar target/Panally-1.0-SNAPSHOT.jar server config/config.yaml

db-check:
	mvn package
	java -jar target/Panally-1.0-SNAPSHOT.jar db status config/config.yaml

db-migrate:
	mvn package
	java -jar target/Panally-1.0-SNAPSHOT.jar db migrate config/config.yaml