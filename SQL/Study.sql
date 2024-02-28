/*
    ����Ŭ ������ �ּ�
*/
-- ����Ŭ ���� �ּ�

CREATE TABLE EX1 (
    COL1 NUMBER,
    COL2 VARCHAR2(100),
    COL3 DATE
);

/*
    ����Ŭ ��ɾ�(CREATE, INSERT ��)�� ��/�ҹ��� ���� X
    ����Ŭ���� ���̺� ��� �÷� ���� �빮�ڷ� ��ȯ
*/

INSERT INTO EX1 VALUES(
    100, 
    'Hello',
    sysdate
);
-- sysdate : ��ɾ� ���� ������ �ð� ����

INSERT INTO EX1 VALUES(
    'abcd', -- ������ Ÿ�� ����ġ�� ���� �߻�
    200,
    sysdate
);

-- VARCHAR2 ������ Ÿ��
CREATE TABLE EX2(
    COL1 VARCHAR2(3), -- ���ڿ� 3����Ʈ����
    COL2 VARCHAR2(3 BYTE), -- ���ڿ� 3����Ʈ����
    COL3 VARCHAR2(3 CHAR) -- ���� 3������
);

INSERT INTO EX2 VALUES(
    'abc',
    'abc',
    'abc'
);

INSERT INTO EX2 VALUES(
    '��',
    '��',
    '�ѱ۳�'
);

-- EX2 ���̺� COL1 - 'abc', COL2 - 'def' �����͸� ����
INSERT INTO EX2 (COL1, COL2)
VALUES('abc', 'def');

commit;

/*
    ���� ����
    NOT NULL : �����͸� �ݵ�� �Է�
    UNIQUE : �ߺ����� �ʴ� �����͸� �Է� ����
    PRIMARY KEY : ���̺��� ������ �����͸� ã�� �� �ִ� �÷�
    - �����Ͱ� �ݵ�� �����ؾ��ϰ�, �ߺ����� �ʾƾ� ��
    
    FOREIGN KEY : ���̺� ���� ���� ������ ���Ἲ�� ���� ���� ����
    - �ݵ�� �����ϴ� ���̺��� ���� �����Ǿ�� �ϸ�, ����Ű�� ���� ���̺��� �⺻Ű�� �����Ǿ�� �Ѵ�.


*/

CREATE TABLE EX3 (
    COL1 VARCHAR2(10) NOT NULL,
    COL2 VARCHAR2(10) UNIQUE
);

INSERT INTO EX3 
VALUES ('AA', 'BB');

INSERT INTO EX3 
VALUES ('aa', 'BB');
-- COL2�� UNIQUE�ؾ� �Ѵٴ� ���� ���� ����

INSERT INTO EX3 (COL2)
VALUES ('CC');
-- COL1�� NOT NULL�̾�� �Ѵٴ� ���� ���� ����

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
    CHECK (GENDER IN ('��', '��'))
);

-- CHECK : ���ǿ� �����ϴ� �����͸� �Է��� �����ϵ��� �����ϴ� ���� ����

INSERT INTO EX7
VALUES(12, '����');

-- ALTER TABLE : ���̺� ������ ������ �� ���

-- ���� ���� �߰�
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

-- ���̺� �÷� �̸� ����
ALTER TABLE EX9 RENAME COLUMN COL1 TO AGE;
DESC EX9;
-- DESC : DESCRIBE (���̺� ���)

-- ���̺� �÷� ������ Ÿ�� ����
ALTER TABLE EX9 MODIFY COL2 NUMBER;
DESC EX9;

-- ���̺� �÷� �߰�
ALTER TABLE EX9 ADD COL3 DATE;
DESC EX9;

ALTER TABLE EX9 DROP COLUMN COL3;
DESC EX9;

COMMIT;

