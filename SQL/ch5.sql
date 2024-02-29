-- SELECT 컬럼의 별명
SELECT EMPLOYEE_ID AS 사번, LAST_NAME 이름 FROM EMPLOYEES;

CREATE TABLE EMP1 (
    EMP_ID NUMBER,
    FIRST_NAME VARCHAR2(100),
    LAST_NAME VARCHAR2(100),
    SALARY NUMBER
);

-- INSERT-SELECT 구문
INSERT INTO EMP1
SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, SALARY
FROM EMPLOYEES
WHERE SALARY > 10000;

-- 오라클 함수
-- COUNT() : 데이터가 존재하는 행의 갯수 출력
SELECT COUNT(*) CNT FROM EMPLOYEES;
SELECT COUNT(EMPLOYEE_ID) CNT FROM EMPLOYEES;
SELECT COUNT(MANAGER_ID) CNT FROM EMPLOYEES;
-- NULL 값은 COUNT 안함 -> PK 또는 *로  

-- 대소문자 변환 LOWER() UPPER() nvl(컬럼, 치환값) : 컬럼의 null 값을 치환값으로 변환


