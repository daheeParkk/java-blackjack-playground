## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
---
## 블랙잭 구현 목록
> #### Blackjack
> - [x] 랜덤 카드 꺼내오기
> - [x] 결과 계산하기
> - [x] 최종 수익 계산하기
> - [ ] 21을 넘을 경우 배팅 금액 잃음
> - [x] 처음 두 장이 21일 경우 배팅 금액의 1.5배를 받음
>   - 플레이어와 딜러가 동시에 21이면 배팅 금액을 돌려받음
> - [ ] Ace 는 1 또는 11로 계산할 수 있음 
> #### InputView
> - [x] 이름 입력받기
> - [x] 배팅 금액 입력받기
> - [x] 추가 카드 받기 여부 입렵받기
> #### OutputView
> - [x] 결과 출력하기
> - [x] 최종 수익 출력하기
