## mariadb user 추가

`mysql.server start`|`mariadb`|`use mysql;`
|:---:|:---:|:---:|
<img width="152" height="28" alt="스크린샷 2026-03-10 오후 2 13 26" src="https://github.com/user-attachments/assets/79193a81-56d6-485f-b718-563c6726ec2e" />|<img width="123" height="153" alt="스크린샷 2026-03-10 오후 2 14 19" src="https://github.com/user-attachments/assets/7977fbcf-204a-43e9-b5ac-c7213d73cdf3" />|<img width="201" height="91" alt="스크린샷 2026-03-10 오후 2 15 22" src="https://github.com/user-attachments/assets/e854ae38-e600-46f3-8c9d-c499d1e70fd2" />

### 사용자 생성

```sql
# 로컬 접속만 허용
create user '추가할 user 이름'@'localhost' identified by `해당 user의 비밀번호`;
```

```sql
# 외부 접속 허용
create user '추가할 user 이름'@'%' identified by `해당 user의 비밀번호`;
```

### 권한 부여

```sql
# 특정 데이터베이스의 모든 권한 부여
grant all privileges on 데이터베이스 이름.* to '추가한 user 이름'@'localhost';
```

```sql
# 모든 데이터베이스의 모든 권한 부여
grant all privileges on *.* to '추가한 user 이름'@'localhost';
```

!로컬 접속이 아닌 외부 접속까지 허용하려면 @ 뒤에 'localhost' &rarr; '%' 변경

### 변경 사항 적용 및 확인

```sql
flush privileges;
```

```sql
select host, user, password from user;
```
