# 페이지 교체 알고리즘

### Index

1. [LRU(Least Recently Used)](#lruleast-recently-used)

<br/>

## LRU(Least Recently Used)

- 페이지 교체 알고리즘 중 하나
- 가장 오랜 시간 사용되지 않은 페이지를 교체하는 알고리즘
- 배열, Linked List 등을 통해 구현 가능

[예시]

- 배열 이용 : [LRU(캐시, 카카오 변형) 문제 풀이](<https://github.com/yewon-Noh/java-algorithm/blob/main/inflearn/047_LRU(%EC%BA%90%EC%8B%9C%2C%20%EC%B9%B4%EC%B9%B4%EC%98%A4%20%EB%B3%80%ED%98%95).java>)

```java
int size = 5;
int[] array = {1,2,3,2,6,2,3,5,7};
int[] cache = new int[size];
for (int job: array) {
    // 해야할 작업이 캐시에 있는지 확인한다.
    int pos = -1;
    for (int i=0; i<size; i++) {
        if (cache[i]==job) pos = i;
    }
    // 없는 경우, 모든 작업을 뒤로 미룬다.
    if (pos == -1) {
        for (int i=size-1; i>0; i--) {
            cache[i] = cache[i-1];
        }
    }
    // 있는 경우, 원래 있던 작업보다 앞에 있던 작업들을 뒤로 미룬다.
    else {
        for (int i=pos; i>0; i--) {
            cache[i] = cache[i-1];
        }
    }
    // 작업을 맨 앞에 추가한다.
    cache[0] = job;
}
```
