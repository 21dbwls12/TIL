1. AWS 서버에 ubunto로 가상환경 생성
2. 같은 이름으로 로컬에서 가상환경 생성

       cmd에서 가상 환경만들 디렉토리에 들어가서 아래와 같은 코드 실행
       1. mkdir venv
       2. cd venv(venv폴더로 이동)
       3. python -venv [AWS에서 만든 가상환경 이름과 같은 이름]
3. pyenv 설치를 위한 종속성 설치시 문법이 다르다고  할때,

       1. cmd에서 wsl -d Ubuntu 입력 한 후 sudo apt-get install -y make build-essential libssl-dev zlib1g-dev 입력
            근데 성공못함
       2. windowshell(관리자로 실)에서 choco install make build-essential libssl-dev zlib1g-dev 실행
4. 
