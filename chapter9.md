# 9장 값 타입
### 9.5 값 타입 컬렉션
값 타입을 하나 이상 저장하려면 컬렉션에 보관하고 @ElemnetCollection, @CollerctionTable 어노테이션을 사용   
임베디드 값 타입 컬렉션 수정 : 값 타입은 불변해야 한다. 따라서 컬렉션에서 기존 주소를 삭제 하고 새로운 주소를 등록했다.   
값 타입은 equals, hashcode를 꼭 구현해야한다.