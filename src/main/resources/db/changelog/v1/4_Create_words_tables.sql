create table ru_words(
                         id serial primary key not null ,
                         meaning varchar(45) not null unique
);

create table en_words(
                         id serial primary key not null ,
                         meaning varchar(45) not null unique
);

