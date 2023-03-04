# 정렬 알고리즘

### Index

1. [시간복잡도](#시간복잡도)
2. [선택정렬](#선택-정렬)
3. [버블정렬](#버블-정렬)
4. [삽입정렬](#삽입-정렬)

<br/>

## 시간복잡도

각 정렬의 시간 복잡도는 아래와 같다.

- Arrays.sort() : (평균) O(nlogn), (최악) O(n^2)
- Collections.sort() : O(nlog(n))

![images_kimjy199_post_e34bfb25-049b-4cb7-94c1-60282f2b852d_image](https://user-images.githubusercontent.com/80824750/222670565-df10ad04-f8f3-4903-a1d1-fabb396b23be.png)

https://velog.io/@kimjy199/백준-2751번.-수-정렬하기-2-Java

<br/>

## 선택 정렬

- 제자리 정렬 알고리즘 중 하나

[과정]

1. 주어진 배열 중 최솟값을 찾는다.
2. 그 값을 맨 앞에 위치한 값과 교체한다.
3. 맨 처음 위치를 뺀 나머지 리스트를 같은 방법으로 교체한다.
4. 하나의 원소만 남을 때까지 위 1~3 과정을 반복한다.

<img src="https://user-images.githubusercontent.com/80824750/221116130-6d2cfc3d-c11f-45b5-80c8-3002679fe5f7.png" width="400"/>

https://gmlwjd9405.github.io/2018/05/06/algorithm-selection-sort.html

[예시]

```java
int[] array = {5,3,4,2,1};
for (int i=0; i<array.length; i++) {
   // 1. 주어진 배열 중에서 최솟값을 찾는다.
   int index=i;
   for (int j=i+1; j<array.length; j++) {
        if (array[j] < array[index]) index = j;
    }
    // 2. 그 값을 맨 앞에 위치한 값과 교체한다.
    int tmp = array[i];
    array[i] = array[index];
    array[index] = tmp;
    // 3. 맨 처음 위치를 뺀 나머지를 같은 방법으로 반복한다.
}
```

<br/>

## 버블 정렬

- 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘

[과정]

1. 첫 번째 자료와 두 번째 자료, 두 번째 자료와 세 번째 자료 ... 마지막-1 번째 자료와 마지막 자료를 비교하여 교환하면서 자료를 정렬한다.
2. 1 회전을 수행한 뒤 가장 큰 자료가 맨 뒤로 이동하게 된다. 2회전에서는 맨 끝에 있는 자료는 정렬에서 제외하고 수행한다.
3. 하나씩 정렬에서 제외해 나가면서 하나의 자료만 남을 때까지 반복한다.

<img src="https://user-images.githubusercontent.com/80824750/221117558-122f5109-1096-4a99-bb06-87d24f8ee5ed.png" width="800"/>

https://gmlwjd9405.github.io/2018/05/06/algorithm-bubble-sort.html

[예시]

```java
int[] array = {5,3,4,2,1};
int n = array.length;
for (int i=0; i<n-1; i++) {
    for (int j=0; j<n-i-1; j++) {
        if (array[j] > array[j+1]) {
            int tmp = array[j];
            array[j] = array[j+1];
            array[j+1] = tmp;
        }
    }
}
```

<br/>

## 삽입 정렬

- 자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽임함으로써 정렬을 완성하는 알고리즘

[과정]

1. 두 번째 자료부터 시작하여 그 앞의 자료들과 비교하여 삽입할 위치를 지정한 후 자료를 뒤로 옮기고 지정한 자리에 자료를 삽입한다.
2. 마지막 요소까지 이를 반복한다.

<img src="https://user-images.githubusercontent.com/80824750/221119644-3a53c371-f19e-4962-8166-6603bbd6c830.png" width="800"/>

https://gmlwjd9405.github.io/2018/05/06/algorithm-insertion-sort.html

[예시]

```java
int[] array = {5,3,4,2,1};
int n = array.length;
// 두 번째 카드부터 반복한다.
for (int i=1; i<n; i++) {
    // i번째 보다 앞에 있는 카드를 비교한다.
    for (int j=i-1; j>=0; j--) {
        // 두 카드를 비교하여 정렬한다.
        if (array[j] > array[j+1]) {
            int tmp = array[j];
            array[j] = array[j+1];
            array[j+1] = tmp;
        }
    }
}
```
