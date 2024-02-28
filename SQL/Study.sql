/*
    오라클 여러줄 주석
*/
-- 오라클 한줄 주석

CREATE TABLE EX1 (
    COL1 NUMBER,
    COL2 VARCHAR2(100),
    COL3 DATE
);

/*
    오라클 명령어(CREATE, INSERT 등)은 대/소문자 구분 X
    오라클에서 테이블 명과 컬럼 명을 대문자로 변환
*/

INSERT INTO EX1 VALUES(
    100, 
    'Hello',
    sysdate
);
-- sysdate : 명령어 수행 시점의 시간 저장

INSERT INTO EX1 VALUES(
    'abcd', -- 데이터 타입 불일치로 에러 발생
    200,
    sysdate
);

-- VARCHAR2 데이터 타입
CREATE TABLE EX2(
    COL1 VARCHAR2(3), -- 문자열 3바이트까지
    COL2 VARCHAR2(3 BYTE), -- 문자열 3바이트까지
    COL3 VARCHAR2(3 CHAR) -- 문자 3개까지
);

INSERT INTO EX2 VALUES(
    'abc',
    'abc',
    'abc'
);

INSERT INTO EX2 VALUES(
    '한',
    '글',
    '한글날'
);

-- EX2 테이블에 COL1 - 'abc', COL2 - 'def' 데이터를 삽입
INSERT INTO EX2 (COL1, COL2)
VALUES('abc', 'def');

commit;

/*
    제약 조건
    NOT NULL : 데이터를 반드시 입력
    UNIQUE : 중복되지 않는 데이터만 입력 가능
    PRIMARY KEY : 테이블에서 유일한 데이터를 찾을 수 있는 컬럼
    - 데이터가 반드시 존재해야하고, 중복되지 않아야 함
    
    FOREIGN KEY : 테이블 간의 참조 데이터 무결성을 위한 제약 조건
    - 반드시 참조하는 테이블이 먼저 생성되어야 하며, 참조키가 참조 테이블의 기본키로 설정되어야 한다.


*/

CREATE TABLE EX3 (
    COL1 VARCHAR2(10) NOT NULL,
    COL2 VARCHAR2(10) UNIQUE
);

INSERT INTO EX3 
VALUES ('AA', 'BB');

INSERT INTO EX3 
VALUES ('aa', 'BB');
-- COL2는 UNIQUE해야 한다는 제약 조건 위배

INSERT INTO EX3 (COL2)
VALUES ('CC');
-- COL1은 NOT NULL이어야 한다는 제약 조건 위배

CREATE TABLE EX4(
    COL1 VARCHAR2(10) PRIMARY KEY,
    COL2 VARCHAR2(10)
);

INSERT INTO EX4
VALUES('AB', 'CD');

INSERT INTO EX4
VALUES('AB', 'EF');

INSERT INTO EX4(COL2)
VALUES('ABC');

CREATE TABLE EX5(
    COL1 VARCHAR2(10),
    COL2 VARCHAR2(10),
    CONSTRAINTS PK_EX5 PRIMARY KEY(COL1)
);

CREATE TABLE EX6(
    COL1 VARCHAR2(10),
    CONSTRAINTS UN_EX6 UNIQUE(COL1)
);

CREATE TABLE EX7(
    AGE NUMBER CHECK (AGE >= 0),
    GENDER VARCHAR2(10),
    CONSTRAINTS CHECK_GENDER
    CHECK (GENDER IN ('남', '여'))
);

-- CHECK : 조건에 부합하는 데이터만 입력이 가능하도록 설정하는 제약 조건

INSERT INTO EX7
VALUES(12, '남자');

-- ALTER TABLE : 테이블 정보를 변경할 때 사용

-- 제약 조건 추가
ALTER TABLE EX7 ADD CONSTRAINTS UN_EX7 UNIQUE (AGE);

CREATE TABLE EX8(
    COL1 VARCHAR2(10),
    CONSTRAINTS NN_EX8
    CHECK(COL1 IS NOT NULL)
);

CREATE TABLE EX9(
    COL1 NUMBER,
    COL2 VARCHAR2(10)
);

-- 테이블 컬럼 이름 변경
ALTER TABLE EX9 RENAME COLUMN COL1 TO AGE;
DESC EX9;
-- DESC : DESCRIBE (테이블 요약)

-- 테이블 컬럼 데이터 타입 변경
ALTER TABLE EX9 MODIFY COL2 NUMBER;
DESC EX9;

-- 테이블 컬럼 추가
ALTER TABLE EX9 ADD COL3 DATE;
DESC EX9;

ALTER TABLE EX9 DROP COLUMN COL3;
DESC EX9;

COMMIT;

