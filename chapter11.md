## 웹 애플리케이션 제작

```text
인텔리제이에서 실행 방법
maven으로 run하고 옵션에 tomcat7:run 를 준다.

```
하이버네이트 속성 설정
* hibernate.dialect: 데이터베이스방언
* hibernate.show_sql: sql을 콘솔에 출력한다.
* hibernate.format_sql: sql을 보기 좋게 정리해서 출력한다.
* hibernate.use_sql_comments: sql을 출력할 때 어떻게 실행된 sql인지 또는 사용자가 설정한 코멘트를 남긴다.
* hibernate.show_sql.id.new_generator_mappings: jpa에 맞춘 새로운 id 생성 방법을 사용한다.(레거시를 운영하는게 아니라면 항상 true로 설정해야 한다.)