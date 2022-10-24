# 맛집 공유 커뮤니티 
## 음식을 좋아하시는 분들이라면 다들 찐 맛집 하나정도는 알고 계시죠? [Cracker](https://crackers.life)와 함께 공유해보아요

![image](https://user-images.githubusercontent.com/104111112/194705565-f1eb66b0-7417-424d-b48b-8663b2790895.png)

## 1. 프로젝트 개요
- 개발기간 : 2022.06.24 ~ 2022.07.29
- 참여인원 : 5명

## 2. 사용기술
- Backend : `Java 11` `Spring Boot 2.6.9` `Spring Data JPA` `Gradle 7.4.1`
- Frontend : `JQuery` `Javascript` `Bulma` `HTML 5` `CSS 3`
- Database : `AWS RDS` `MySQL 8.0.28` `H2`
- Security : `Spring Security`
- Cloud : `AWS S3` `AWS EC2` `AWS CodeDeploy` `AWS Secret Manager`
- CI/CD : `Github Actions`

## 3. ERD 설계
![image](https://user-images.githubusercontent.com/103913683/184919972-765ff552-e644-4aa2-b074-2b787a185516.png)

## 4. 아키텍쳐
![cracker_architecture_2](https://user-images.githubusercontent.com/103913683/184920468-818bb09c-f3de-47fa-a84a-6c54f9bd1fbb.png)

## 5. 맡은 기능
- 커뮤니티 페이지 댓글 CRUD
    - @Transactional 사용
    - Controller, Service, Repository Layered Architecture 사용
    - DTO의 데이터 반환을 통한 유지보수 증가
- Spring Data JPA 활용
    - 커뮤니티 페이지 댓글 시간 순 정렬
    - **LocalDateTime**의 표준값을 한글화 코드 적용 ( [velog](https://velog.io/@rhrhkdwls24/TIL-22.07.11) 블로그 정리 )

## 5. 고객 피드백
<summary>고객 피드백 내용</summary>
<li>만족도</li></br>
<img width="806" alt="스크린샷 2022-08-14 오후 1 05 59" src="https://user-images.githubusercontent.com/103913683/186093272-51bf6a77-ca8f-41d6-ac20-f7ce4a330b36.png"></br>
<li>불편했던 점</li></br>
<img width="806" alt="스크린샷 2022-08-14 오후 1 05 59" src="https://user-images.githubusercontent.com/103913683/186093554-0b2c01b1-7d65-4b2a-b247-17d16b56d821.png"></br>
<li>좋았던 점</li></br>
<img width="806" alt="스크린샷 2022-08-14 오후 1 05 59" src="https://user-images.githubusercontent.com/103913683/186093705-619ea50f-9175-4a29-b059-de22e073001a.png"></br>
<li>상세 피드백 요약</li></br>
<a href="https://goofy-draw-ced.notion.site/cfdfc381933a46ff91ceed1cafbfd1ab">상세 피드백 요약으로 이동</a>
</details>


