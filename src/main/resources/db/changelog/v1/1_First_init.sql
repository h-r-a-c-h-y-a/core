create table users (
                       id serial not null primary key ,
                       email varchar(45) not null unique ,
                       password varchar(45) not null
);
