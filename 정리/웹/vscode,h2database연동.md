[참고 사이트](https://velog.io/@hodumaru/H2-Database-%EC%97%B0%EA%B2%B0%ED%95%98%EA%B8%B0)
[참고 사이트-yml](https://marginata.tistory.com/171)

VScode &rarr; spring boot

## H2 데이터베이스 연동

1. src/main/resources &rarr; application.properties or application.yml 열고 다음 코드 작성  
  `spring.h2.console.enabled=true`
    > .yml로 변경한 이유 &rarr; 더 읽기 쉽고, 작성 용이
  
    <img width="488" height="116" alt="스크린샷 2026-03-09 오후 8 53 21" src="https://github.com/user-attachments/assets/0196dd24-7ec2-4774-bb29-2d5409fa88d1" />


2. 인터넷 주소로 접속

    <img width="464" height="371" alt="스크린샷 2026-03-09 오후 8 54 43" src="https://github.com/user-attachments/assets/a0f40ab4-0582-4d9a-a825-2556789fcc7d" />

3. 주소 연결

    <img width="675" height="15" alt="스크린샷 2026-03-09 오후 8 55 59" src="https://github.com/user-attachments/assets/f18cfb8a-e45f-4c32-9270-8b36ec7028cc" />

   여기 뒤의 주소를 H2 콘솔 &rarr; JDBC URL 칸에 복붙

   <img width="1189" height="749" alt="스크린샷 2026-03-09 오후 8 58 07" src="https://github.com/user-attachments/assets/499b96e6-eef3-4697-aead-19c4a84b81bd" />

5. 위의 주소는 동적이라 계속 변경되므로 정적 URL로 설정

  `datasource.url`

  <img width="363" height="113" alt="스크린샷 2026-03-09 오후 9 03 23" src="https://github.com/user-attachments/assets/6b5a7e01-9a0d-41e3-842b-4dedad8c4365" />
<br>
  <img width="510" height="17" alt="스크린샷 2026-03-09 오후 9 04 02" src="https://github.com/user-attachments/assets/f1dcccea-d941-410a-abc6-e03fcf9b9670" />
<br>
  <img width="500" height="423" alt="스크린샷 2026-03-09 오후 9 04 49" src="https://github.com/user-attachments/assets/9ebf48ab-4a88-4ac7-b5dc-abe4cfc0638a" />

6. 
