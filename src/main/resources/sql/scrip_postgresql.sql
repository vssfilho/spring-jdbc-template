CREATE SEQUENCE SEQ_PATENTE
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;
	
CREATE SEQUENCE SEQ_REQUERENTE_PATENTE
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;	
	
CREATE SEQUENCE SEQ_TITULO_PATENTE
    INCREMENT 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 1
    CACHE 1;
	
CREATE TABLE TB_PATENTE
(
	ID integer NOT NULL UNIQUE,
    NU_PUB text COLLATE pg_catalog.default NOT NULL,
    NU_PEDIDO_INTENACIONAL text COLLATE pg_catalog.default NOT NULL,
    DT_PUBLICACAO date NOT NULL
    , CONSTRAINT PK_TB_PATENTE PRIMARY KEY (ID)
);

COMMENT ON TABLE TB_PATENTE
    IS 'Tabela com as patentes cadastradas';

ALTER TABLE TB_PATENTE ALTER COLUMN ID SET DEFAULT NEXTVAL('SEQ_PATENTE'::regclass);

CREATE TABLE TB_REQUERENTE_PATENTE
(
	ID integer NOT NULL,
    FK_ID_PATENTE integer NOT NULL,
    NO_REQUERENTE text COLLATE pg_catalog.default NOT NULL,
    CONSTRAINT FK_REQUERENTE_PATENTE FOREIGN KEY (FK_ID_PATENTE)
        REFERENCES TB_PATENTE (ID) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT PK_TB_REQUERENTE_PATENTE PRIMARY KEY (ID)
);

COMMENT ON TABLE TB_REQUERENTE_PATENTE
    IS 'TABELA DE REQUERENTES DA PATENTE';

ALTER TABLE TB_REQUERENTE_PATENTE ALTER COLUMN ID SET DEFAULT NEXTVAL('SEQ_REQUERENTE_PATENTE'::regclass);

CREATE TABLE TB_TITULO_PATENTE
(
	ID integer NOT NULL,
    FK_ID_PATENTE integer NOT NULL,
    NO_TITULO text COLLATE pg_catalog.default NOT NULL,
    CONSTRAINT FK_REQUERENTE_TITULO FOREIGN KEY (FK_ID_PATENTE)
        REFERENCES TB_PATENTE (ID) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT PK_TB_TITULO_PATENTE PRIMARY KEY (ID)
);

COMMENT ON TABLE TB_TITULO_PATENTE
    IS 'TABELA DE TITULOS QUE A PATENTE  POSSUI';

ALTER TABLE TB_TITULO_PATENTE ALTER COLUMN ID SET DEFAULT NEXTVAL('SEQ_TITULO_PATENTE'::regclass);