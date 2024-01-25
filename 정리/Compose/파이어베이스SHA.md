# Terminal
## Mac  
- keytool -list -v -keystore ~/.android/debug.keystore -alias androiddebugkey -storepass android -keypass android

## Android  
- cd android
  - gradlew signingReport


# Gradle  
android studio 4.2버전부터 task목록이 안보인다  
![스크린샷 2024-01-25 오후 7 05 08](https://github.com/21dbwls12/TIL/assets/139525941/acf03e71-a1b0-48ed-8293-a5b26400ce3f)  
우측 코끼리(Gradle)누르고  
![스크린샷 2024-01-25 오후 7 06 15](https://github.com/21dbwls12/TIL/assets/139525941/1ed105d3-3ddf-486c-b506-0e42d13be9fd)  
가장 좌측 아이콘 누르기![스크린샷 2024-01-25 오후 7 06 37](https://github.com/21dbwls12/TIL/assets/139525941/895ada19-c717-4049-ac40-346f8a7c0115)
 
- gradle signingReport  
###### 뜨긴 뜨는데 오래걸림. 터미널 이용하는 방법이 더 빠름.
