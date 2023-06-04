# 스프링 입문
[인프런 강의 - 기록 및 정리] 스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술

### 프로젝트 환경 설정
    스프링 프로젝트와 테스트 페이지 생성 후 빌드

    1. Spring Boot는 static과 template 경로에서 welcomePage로 index.html을 먼저 찾는다.
    
    2. 스프링 프로젝트 build 하고 실행하는 방법
        1) 스프링 프로젝트 경로로 이동하여 gradlew.bat 파일을 빌드한다.
            > window의 경우, gradlew.bat clean build
            > macOS의 경우, ./gradlew build
        2) 위의 명령어를 실행하면 /build/libs 경로에 jar 파일이 생성된다.
            > java -jar hello-spring-0.0.1-SNAPSHOT.jar
            > 서버가 실행된다.
            > 브라우저에서 localhost:8080으로 확인!

### 스프링 웹 개발 기초
    1. 정적 컨텐츠
        파일을 그대로 전달
        > http://localhost:8080/hello-static.html
        > controller에서 확인했을 때 관련 api가 없으면 resource 경로에서 파일을 찾아 정적 컨텐츠를 전달한다.
    2. MVC와 템플릿 엔진
        데이터를 변경하고 템플릿 엔진을 사용하여 전달
        > MVC(Model View Controller)
        > view는 화면, controller는 비즈니스 로직 처리, model은 데이터 관리로 분리
    3. API
        JSON 형태로 데이터를 전달
        > @ResponseBody를 설정하면 뷰 이름을 반환하는 것이 아니라 데이터 그대로 전달하도록 인식한다.
        > HTTP body에 문자내용을 직접 반환
        > 객체를 생성하여 JSON(key : value) 형태로 데이터를 전달