CREATE TABLE BOOK(
    BOOK_ID NUMBER PRIMARY KEY,
    NAME VARCHAR2(50) NOT NULL,
    WRITER VARCHAR2(40) NOT NULL,
    CATEGORY VARCHAR2(10) NOT NULL,
    PUBLISHER VARCHAR2(40) NOT NULL,
    PUB_DATE DATE NOT NULL,
    STATE VARCHAR2(10) NOT NULL,
    IMAGE VARCHAR2(40)
);

CREATE SEQUENCE BOOK_ID_GEN 
    START WITH 1
    NOCYCLE
    NOCACHE;

INSERT INTO BOOK VALUES(    
    book_id_gen.nextval,
    'To Kill a Mockingbird',
    'Harper Lee',
    'novel',
    'J. B. Lippincott Co.',
    '1960-01-05',
    '정상',
    NULL
);

INSERT INTO BOOK VALUES(    
    book_id_gen.nextval,
    'Pride and Prejudice',
    'Jane Austen',
    'romance',
    'T. Egerton, Whitehall',
    '1813-05-30',
    '정상',
    NULL
);

commit;