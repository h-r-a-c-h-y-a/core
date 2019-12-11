create table images
(
    id                serial primary key not null,
    name              varchar(45)        not null,
    original_filename varchar(45)        not null,
    content_type      varchar(45)        not null,
    size              bigint             not null,
    file_content      bytea              not null
);
