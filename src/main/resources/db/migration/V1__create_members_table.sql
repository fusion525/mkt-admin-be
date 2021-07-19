create table members (

    ID bigint not null auto_increment primary key,
    NMMKTCARD varchar(50),
    STFULLNAME varchar(200),
    STFIRSTNAME varchar(100),
    STLASTNAME varchar(100),
    EMAIL varchar(100),
    TEL1 varchar(10),
    ZIP1 varchar(8),
    STCITY1 varchar(50),
    STADDRESS1 varchar(255),
    DTBIRTH date,
    STBIRTHPLACE varchar(50),
    STMEMBSTATE varchar(50)

);