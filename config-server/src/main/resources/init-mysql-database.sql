create table `config`.`PROPERTIES` (
    `id` integer not null auto_increment,
    CREATED_ON datetime ,
    APPLICATION varchar(255),
    PROFILE varchar(255),
    LABEL varchar(255),
    PROP_KEY varchar(255),
    VALUE varchar(255),
    primary key (id)) engine=InnoDB;


INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','app.message','Hello from Spring cloud config JDBC');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','dev','master','app.message','Hello from Spring cloud config JDBC, DEV profile');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','cloud.aws.credentials.useDefaultAwsCredentialsChain', 'true');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','cloud.aws.stack.auto','false');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','cloud.aws.region.static', 'us-east-2');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','cloud.aws.region.auto', 'false');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','spring.rabbitmq.host', 'localhost');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','spring.rabbitmq.port', '5672');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','spring.rabbitmq.username', 'guest');
INSERT INTO config.PROPERTIES (CREATED_ON, APPLICATION, PROFILE, LABEL, PROP_KEY, VALUE) VALUES (NULL,'mongo-config-testingbed','default','master','spring.rabbitmq.password', 'guest');

commit;

