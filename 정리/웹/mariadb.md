[참고 사이트](https://gymdev.tistory.com/92)

--------------------------------------------

## 터미널 사용해서 다운로드

1. `% brew upgrade`

<img width="262" height="50" alt="스크린샷 2026-03-09 오후 8 12 50" src="https://github.com/user-attachments/assets/f9185a1e-fa32-446a-8292-fc8c6e74069c" />
  
2. `% brew install mariadb`

<img width="253" height="31" alt="스크린샷 2026-03-09 오후 8 13 48" src="https://github.com/user-attachments/assets/418dea07-9189-4c69-b7e0-4c4419bf3e07" />  

<br>
  
<img width="520" height="137" alt="스크린샷 2026-03-09 오후 8 14 36" src="https://github.com/user-attachments/assets/9b7a7afb-0a96-4f61-989b-fdb2c85603fa" />

## 설치 확인

`% mariadb -V`

<img width="288" height="27" alt="스크린샷 2026-03-09 오후 8 15 32" src="https://github.com/user-attachments/assets/d013bbeb-7a55-477a-a940-9ca0836346cd" />

!대소문자 주의

## 실행

1. `%mysql.server start`

<img width="149" height="30" alt="스크린샷 2026-03-09 오후 8 18 20" src="https://github.com/user-attachments/assets/7d3af750-0cd1-4834-b43b-197025492b73" />

2. `% mariadb`

<img width="557" height="122" alt="스크린샷 2026-03-09 오후 8 19 26" src="https://github.com/user-attachments/assets/a17c4787-3024-4287-bd68-5e115214971b" />
<br>
<img width="115" height="19" alt="스크린샷 2026-03-09 오후 8 19 42" src="https://github.com/user-attachments/assets/60b190ab-a0bf-4d2f-a83d-efee2f0469d9" />

3. 데이터베이스 확인

`show database;`

<img width="158" height="131" alt="스크린샷 2026-03-09 오후 8 20 34" src="https://github.com/user-attachments/assets/33395584-ed29-41b2-87e7-c0bbaaec977a" />

4. mysql로 언어 변경

`use mysql`

<img width="476" height="101" alt="스크린샷 2026-03-09 오후 8 21 20" src="https://github.com/user-attachments/assets/c1c8c400-0cef-413c-91ed-10fb42da22c6" />

## 비밀번호 설정

1. `select host, user, password from user;`

<img width="386" height="17" alt="스크린샷 2026-03-09 오후 9 49 59" src="https://github.com/user-attachments/assets/1b0ce7fa-3d19-43ca-a0a4-d8ef3dbdc91f" />
<br>
<img width="155" height="19" alt="스크린샷 2026-03-09 오후 9 50 23" src="https://github.com/user-attachments/assets/edd97355-0a20-4ce3-9d28-3501d7807e55" />

  invalid로 되어있는 것 확인

2. 비밀번호 변경

```
set password for 'root'@'localhost'=password('{변경할 비밀번호}');
# 변경한 내용 변경
flush privileges;
```

3. 다시 확인

`select host, user, password from user;`

<img width="211" height="21" alt="스크린샷 2026-03-09 오후 10 02 45" src="https://github.com/user-attachments/assets/cf77ca97-2207-476a-b3d3-d31885b52bbf" />

비밀번호가 암호화되어 설정된 것 확인

## 종료

`\q`

<img width="151" height="33" alt="스크린샷 2026-03-09 오후 10 03 59" src="https://github.com/user-attachments/assets/27df55e7-5c3c-4604-a1fd-614ca9d9caea" />


## 명령어

```
# MariaDB 서버 실행
brew services start mariadb
 
# MariaDB 서버 중지
brew services stop mariadb
 
# MariaDB 서버 재시작
brew services restart mariadb
 
# MariaDB 서버 실행 확인
brew services list

# 홈브류 업데이트
brew upgrade
 
# MariaDB Server 업데이트
brew upgrade mariadb
```

