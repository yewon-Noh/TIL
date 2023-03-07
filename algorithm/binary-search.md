# 이분탐색(이분검색) 알고리즘

데이터가 정렬되어 있는 수열에서 특정한 값의 위치를 찾는 알고리즘이다.

**특징**
 
- 데이터가 오름차순으로 정렬되어 있어야 한다.
- 시간 복잡도가 O(log2N) 으로 빠르다.

### 구현 방법

배열에 아래의 데이터가 존재하며, 탐색 범위는 array[low]부터 array[high]이라고 가정한다.

```
int[10] array = {1,3,5,7,8,10,20,35,99,100};
```

1. 탐색할 배열의 중간값을 가져온다.

   mid = (low + high)/2

2. 중간값과 검색값(key)을 비교한다.

   - key > mid : 검색값이 중간값보다 크다면 `low = mid+1` (왼쪽 반을 버린다.)
   - key < mid : 검색값이 중간값보다 작다면 `high = mid-1` (오른쪽 반을 버린다.)
   - key == mid : 검색값을 찾았으므로, 중간 값을 리턴한다.
  
3. 위의 과정을 반복하며 구하고자 하는 값을 찾는다.

<img width="429" alt="img1 daumcdn" src="https://user-images.githubusercontent.com/80824750/223320528-fd2740ce-da2d-4ad8-9e5e-2d7b61ecd127.png">

https://minhamina.tistory.com/127

### 예시

```java
public int binarySearch(int key, int[] array) {
    int low = 0, high = array.length-1;
    while (low <= high) {
        int mid = (low + high)/2;
        if (key > array[mid]) low = mid+1;
        else if (key < array[mid]) high=mid-1;
        else if (key == array[mid]) return mid+1;
    }
    return -1;
}

// main
int[10] array = {1,3,5,7,8,10,20,35,99,100};
int key = 5;
binarySearch(key, array);
```


## 참고 링크

- https://yoongrammer.tistory.com/75
- https://minhamina.tistory.com/127
