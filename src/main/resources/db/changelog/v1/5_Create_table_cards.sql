create table cards(
                      id serial primary key not null ,
                      en_word_id bigint not null ,
                      ru_word_id bigint not null ,
                      rating bigint ,
                      FOREIGN KEY (en_word_id) REFERENCES en_words(id) on DELETE NO ACTION  on UPDATE NO ACTION,
                      FOREIGN KEY (ru_word_id) REFERENCES ru_words(id) on DELETE NO ACTION  on UPDATE NO ACTION,
                      UNIQUE (en_word_id, ru_word_id)
);
