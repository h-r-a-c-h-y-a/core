create table user_role(
                          user_id bigint not null ,
                          role_id bigint not null ,
                          PRIMARY KEY (user_id, role_id),
                          FOREIGN KEY (user_id) REFERENCES users(id) ON UPDATE NO ACTION ON DELETE NO ACTION ,
                          FOREIGN KEY (role_id) REFERENCES roles(id) ON UPDATE NO ACTION ON DELETE NO ACTION
);
insert into roles(name) values ('USER'), ('MANAGER'),('ADMIN');
insert into user_role(user_id, role_id) VALUES (1, 1);
