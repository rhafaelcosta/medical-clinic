CREATE TABLE doctors (

    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    crm VARCHAR(6) NOT NULL UNIQUE,
    specialty VARCHAR(100) NOT NULL,   
    state CHAR(2) NOT NULL,
    city VARCHAR(100) NOT NULL,
    street VARCHAR(100) NOT NULL,
    neighborhood VARCHAR(100) NOT NULL,
    zip_code VARCHAR(9) NOT NULL,
    complement VARCHAR(100),
    number VARCHAR(20),

    CONSTRAINT pk_doctors PRIMARY KEY (id)
);