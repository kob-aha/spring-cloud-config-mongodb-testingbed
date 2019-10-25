create table `config`.`PROPERTIES` (
    `id` integer not null auto_increment,
    CREATED_ON datetime ,
    APPLICATION varchar(255),
    PROFILE varchar(255),
    LABEL varchar(255),
    PROP_KEY varchar(255),
    VALUE varchar(255),
    primary key (id)) engine=InnoDB;

