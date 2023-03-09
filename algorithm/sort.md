# 정렬 알고리즘

### Index

1. [시간복잡도](#시간복잡도)
2. [선택정렬](#선택-정렬)
3. [버블정렬](#버블-정렬)
4. [삽입정렬](#삽입-정렬)
5. [객체정렬](#객체-정렬) : Comparable, Comparator
6. [합병정렬](#합병-정렬)

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

<br/>

## 객체 정렬
_Comparable, Comparator_

객체를 사용자가 정의한 정렬 기준에 맞춰 정렬해야 한느 경우 사용한다. 기본적으로 오름차순이다.

- 예 : [백준 11650_좌표 정렬하기](https://www.acmicpc.net/problem/11650) , [백준 11651_좌표 정렬하기2](https://www.acmicpc.net/problem/11651)
  ```
  2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
  ```
  
### Comparable

정렬 수행 시 기본적으로 적용되는 정렬 기준이 되는 메서드를 정의하는 인터페이스이다. 

[구현 방법]

정렬할 객체에 Comparable를 implements 하여, compareTo() 메서드를 오버라이드하여 구현한다.

compareTo() 메서드 리턴 값에 따라 정렬 된다.
- 음수 또는 0 : 객체의 자리가 그대로 유지
- 양수 : 두 객체의 자리가 바뀜

```java
class Point implements Comparable<Point> {
    private int x;
    private int y;
    
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        // x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

// main에서 사용법
ArrayList<Point> array = new ArrayList<>();
array.add(new Point(x, y));
Collections.sort(array);
```

### Comparator

기본 정렬 기준과 다르게 정렬 하고 싶을 때 사용하는 인터페이스이다.

compare() 메서드 리턴 값에 따라 정렬 된다. (Comparable compareTo와 동일)
- 음수 또는 0 : 객체의 자리가 그대로 유지
- 양수 : 두 객체의 자리가 바뀜

[구현 방법]

두 방법에서 사용하는 Point class는 동일하다.

```java
class Point {
    private int x;
    private int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter
}
```

1. **Comparator 인터페이스 이용**

```java
import java.util.Comparator;

class MyComparator implements Comparator<Point> {
    @Override
    public int compare(Point o1, Point o2) {
        // x좌표가 감소하는 순으로, x좌표가 같으면 y좌표가 감소하는 순서
        if (o1.getX() == o2.getX()) return o2.getY() - o1.getY();
        else return o2.getX() - o1.getX();
    }
}

// main에서 사용법
ArrayList<Point> array = new ArrayList<>();
array.add(new Point(x, y));
MyComparator comparator = new MyComparator();
Collections.sort(array, comparator);
```

2. **Comparator 익명 클래스 이용**

```java
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        ArrayList<Point> array = new ArrayList<>();
        array.add(new Point(x, y));
        
        Collections.sort(array, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                // x좌표가 감소하는 순으로, x좌표가 같으면 y좌표가 감소하는 순서
                if (o1.getX() == o2.getX()) return o2.getY() - o1.getY();
                else return o2.getX() - o1.getX();
            }
        });
    }
}
```

<br/>

## 합병 정렬
_merge sort_

- 하나의 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음, 두 개의 정렬된 부분 리스트를 합하여 전체가 정렬된 리스트가 되게 하는 정렬 방법
- 안정 정렬에 속하여, 분할 정복(divide and conquer) 알고리즘의 하나 이다.

[과정]

분할, 정복, 결합 3가지로 나누어진다.

1. 분할(Divide) : 주어진 리스트를 같은 크기 2개의 부분 리스트로 나눈다.

2. 정복(Conquer) : 부분 리스트를 정렬한다. 부분 리스트의 크기가 충분히 작지 않으면 순환 호출을 이용하여 다시 분할 정복 방법을 적용한다.
   
3. 결합(Combine) : 정렬된 부분 리스트들을 하나의 리스트로 합병한다.

![merge-sort-concepts](https://user-images.githubusercontent.com/80824750/223942563-5125fc4c-6208-48e4-a2ee-11453ba5662b.png)

https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html

[예시]

```java
static int[] arr = {5,3,4,2,1};  // 정렬할 리스트
static int[] sorted = new int[5];

public static void main(String[] args) {
   mergeSort(arr, 0, arr.length-1);
   for (int i: arr) System.out.println(i);
}

static void mergeSort(int[] arr, int left, int right) {
    if (left<right) {
        // Step 1. 분할
        // - 중간 위치를 계산하여 리스트를 균등 분할
        int mid = (left+right)/2;

        // Step 2. 정복
        // - 분할한 두 리스트를 각각 정렬
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        // Step 3. 결합
        // - 정렬된 2개의 부분 리스트를 합병
        merge(arr, left, mid, right);
    }
}

static void merge(int[] arr, int left, int mid, int right) {
    int l = left;      // 왼쪽 부분리스트 시작점
    int r = mid+1;     // 오른쪽 부분리스트의 시작점
    int idx = left;    // 채워넣을 배열의 인덱스

    // 두 리스트를 비교하여 더 작은 값을 새로운 리스트(sorted)로 복사하며 정렬을 수행한다.
    while (l<=mid && r<=right) {
        if (arr[l]<=arr[r])
            sorted[idx++] = arr[l++];
        else
            sorted[idx++] = arr[r++];
    }
    while (r<=right) {
        sorted[idx++] = arr[r++];
    }
    while (l<=mid) {
        sorted[idx++] = arr[l++];
    }

    // 새로운 리스트(sorted)를 원래의 리스트로 재복사한다.
    for (int i = left; i<=right; i++) {
        arr[i] = sorted[i];
    }
}
```
