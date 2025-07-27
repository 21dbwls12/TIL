# Unity와 VScode 연동(Mac)

참고  
https://velog.io/@weed_940322/Mac-VSCode-Unity-%EC%97%B0%EB%8F%99
https://ko-ko-song.tistory.com/56

<br>

-----------------

Unity에서 Window - Package Management - Package Manager - Unity Registry - *Visual* 검색 - Visual Scripting, Visual Studio Editor 설치

-----------------

<br>

## 1. Mono 설치
[Mono 설치 공식 사이트](https://www.mono-project.com/download/stable/)
  - **컴퓨터에 맞는 파일** 다운로드 후 설치
  
### 1-1. Mono 제거
[Mono 제거 방법](https://www.mono-project.com/docs/getting-started/install/mac/#uninstalling-mono-on-macos)
  - `sudo rm -rf /Library/Frameworks/Mono.framework`
  - `sudo pkgutil --forget com.xamarin.mono-MDK.pkg`
  - `sudo rm /etc/paths.d/mono-commands`  
      <img width="352" height="121" alt="스크린샷 2025-07-26 오후 8 37 06" src="https://github.com/user-attachments/assets/0f38ea41-d3f7-4cc3-b3d6-172cf70f543e" />

<br>

## 2. .net 설치
[.net 설치 공식 사이트](https://dotnet.microsoft.com/ko-kr/download/dotnet/sdk-for-vs-code?utm_source=vs-code&utm_medium=referral&utm_campaign=sdk-install)
  - **컴퓨터 하드웨어에 맞는 파일** 다운로드
    - `uname -a`  
      <img width="565" height="45" alt="스크린샷 2025-07-26 오후 8 46 57" src="https://github.com/user-attachments/assets/52e52237-7681-4c8a-a320-50b302725dd5" />
  
### 2-1. .net 제거
[공식 제거 도구 사이트](https://learn.microsoft.com/ko-kr/dotnet/core/additional-tools/uninstall-tool-overview?pivots=os-macos)  
[수동으로 삭제하는 방법](https://blog.aliencube.org/ko/2021/11/24/removing-dotnet-sdks-from-macos-manually/) 
  - 공식에서 제공하는 **제거 도구** 사용해서 제거
    - [제거 도구 깃헙 사이트](https://github.com/dotnet/cli-lab/releases)
    - 깃헙 에셋에서 **컴퓨터 버전에 맞는 압축파일** 다운로드
    - `mkdir -p ~/dotnet-core-uninstall`
      - 기본 폴더의 상위 폴더 중 **사용자** 폴더에 생성됨.
    - `tar -zxf dotnet-core-uninstall.tar.gz -C ./dotnet-core-uninstall`
        <img width="516" height="29" alt="스크린샷 2025-07-26 오후 9 17 01" src="https://github.com/user-attachments/assets/2005bd75-8038-49db-abf3-ce9c824905a6" />
      - 안되면 -C 부터 뒷부분까지 지우고 앞의 압축 명령어만 실행
      - 그래도 안되면 압축파일을 위에서 생성한 *dotnet-core-uninstall* 폴더에 옮긴 후 터미널에 아래 명령어 실행
        - `cd ~/dotnet-core-uninstall`
        - `tar -zxf dotnet-core-uninstall-osx-arm64.tar.gz`
    - `cd ~/dotnet-core-uninstall`
    - `./dotnet-core-uninstall -h`  
        <img width="351" height="27" alt="스크린샷 2025-07-26 오후 9 24 06" src="https://github.com/user-attachments/assets/acd418c2-094b-440f-9f20-6cb953b6d171" />
      - 만약 오류창이 뜨고 위처럼 출력되면 설정 - 보안에서 경고 확인
  - 설치된 .net 버전 확인
    - `dotnet --list-sdks`
    - `dotnet --list-runtimes`
  - 제거 명령어 실행
    - [제거 명령어 설명](https://learn.microsoft.com/ko-kr/dotnet/core/additional-tools/uninstall-tool-cli-remove?pivots=os-macos)
    - `./dotnet-core-uninstall remove`  
        <img width="566" height="41" alt="스크린샷 2025-07-26 오후 9 28 49" src="https://github.com/user-attachments/assets/780a9217-ce69-4eac-b7a0-9f6670dd9948" />
      - https://aka.ms/dotnet-core-uninstall-docs
      - 위와 같은 오류가 뜨면 명령어 앞에 `sudo` 추가
        - `sudo ./dotnet-core-uninstall remove --sdk --all`
        - `sudo ./dotnet-core-uninstall remove --runtime --all`
       
## 3. VScode extension 설치
- C#
  - *제거* 옆 화살표 클릭 -> 특정 버전 설치
  - .net 다운로드 사이트-> 모든 .NET 다운로드 -> 다운로드 -> 모든 .NET 9.0 다운로드 -> 언어 지원 버전 확인  
    <img width="531" height="608" alt="스크린샷 2025-07-26 오후 9 55 43" src="https://github.com/user-attachments/assets/c893e6d6-97d3-49d9-a6ab-65bc6309c8f1" />
    - 2025.7.26 현재 .NET 9.0 설치 후 C# 1.25.4 설치
    - VScode 하단에 불 아이콘이 떠야함.  
      <img width="352" height="70" alt="스크린샷 2025-07-27 오후 3 11 23" src="https://github.com/user-attachments/assets/39682592-9e00-4f62-9ce4-31b9893d86c6" />

- Unity
- Unity Tools
- Unity Code Snippets
