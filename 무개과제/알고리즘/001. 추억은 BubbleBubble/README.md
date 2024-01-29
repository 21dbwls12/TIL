# 추억은 BubbleBubble 


### 성능 요약

메모리: 15556 KB, 시간: 128 ms

### 분류

구현

### 제출 일자

2024년 1월 29일 23:14:28

### 문제 설명

<p>알고리즘 초기에 학습하는 Bubble Sort를 구현해 봅시다.</p>

### 제한 

 <p>최적일 때 O(n)</p>

### 개념

#### 데이터 구조

[참고 사이트](https://medium.com/karuna-sehgal/a-simplifed-expanation-about-data-structures-ddaddd209737)
- Array(배열)
- Hash Table(해시 테이블)
- Linked List
- Graph(그래프)
- Tree
- Queue
- Stack

#### Bubble Sort

 <p>작동 원리</p>  

 1. 정렬되지 않은 배열에서 0번과 1번을 비교
 2. 1번이 더 작으면 0번과 변경, 더 크면 다음 2번과 비교
 3. 위의 방법으로 마지막 인덱스 값까지 반복하여 비교하고 정렬 

![image](https://github.com/21dbwls12/TIL/assets/139525941/79d56ebc-7dd8-41d7-b0a6-2e62422c5531)

<p>특징</p>

- 큰 값이 항상 먼저 정렬
- 이미 정렬되어있는 지 확인하는 것은 한 번의 반복만 필요
- 최선의 시간 복잡도는 O(n), 평균 및 최악의 시간 복잡도는 O(n²)
- 공간 복잡도는 O(1)

#### 시간 복잡도

![image](https://github.com/21dbwls12/TIL/assets/139525941/86f1518f-d36d-4ef2-b81a-c06ee6c6395c)

<p>특징</p>

- 알고리즘 수행 시간을 분석할 때 사용
- 기본 연산(데이터 입출력(copy, move), 산술 연산(add, multiply), 제어 연산(if, while))의 실행 횟수로 수행 시간 평가
  - 기본 연산
    - 데이터 입출력
      - copy
      - move
    - 산술 연산
      - add
      - multiply
    - 제어 연산
      - if
      - while
- 최고차항만 표기
  - T(n) = n² + 2n + 1 = O(n²)
  - T(n) = 2n = O(n)
  - T(n) = 4n + 5 = O(n)  
![스크린샷 2024-01-30 오전 2 06 42](https://github.com/21dbwls12/TIL/assets/139525941/730cfa72-529e-423e-a7df-3697f6a5125f)
- O(1)
  - 입력 크기 n에 상관없이 일정한 연산을 수행할 때
- O(logN)
  - 연산 횟수가 logN에 비례해서 증가할 때
  - ```c
    for(i=1;i<=n;i*2){
      ...
    }
    ```
- O(n)
  - 연산 횟수가 입력 크기 n에 비례해서 증가할 때
  - ```c
    for(i=0; i < n; i++) {
      ...
    }
    ```
- O(n²)
  - 연산 횟수가 n²에 비례해서 증가할 때
  - ```c
    for(i=0; i < n; i++) {
      for(j=0, j < n; j++) {
        ...
      }
    }
    ```
- O(2ⁿ)
  - 연산 횟수가 2ⁿ에 비례해서 증가할 때
  - 예는 피보나치 수열(재귀)
  - ```c
    int func (int n) {
      if (n <= 1) 
        return n;
      return func(n-1) + fun(n-2);
    }
    ```
  - 한번 함수를 호출할 때마다 두 번씩 재귀로 함수를 호출 -> 2ⁿ에 비례해서 증가

#### 시간 복잡도

<p>특징</p>

- 알고리즘에서 사용하는 메모리 양
- Fixed Space(고정 공간)
  -  알고리즘 실행에 필요한 고정된 크기의 메모리
  -  변수, 상수, 간단한 데이터 구조 등
-  Variable Space(가변 공간)
  -  알고리즘 실행에 따라 크기가 변하는 메모리
  -  재귀 스택, 동적 할당된 메모리 등
-  Auxiliary Space(보조 공간)과 Input size(입력 공간)을 합친 포괄적인 개념
  - Auxiliary Space(보조 공간)
    - 알고리즘이 실행을 완료하기 위해 필요한 모든 임시 공간, 입력 공간은 고려하지 않음
- ```c
    int sum(int a[], int n)
    {
      int x = 0;		
      for(int i = 0; i < n; i++) {
        x  = x + a[i];
      }
      return(x);
    }
    ```
  - int arr[n]: 4*n byte (입력 공간)
  - int n : 4 byte (입력 공간)
  - int x : 4 byte (보조 공간)
  - int i : 4 byte (보조 공간)
  - 총 4n + 12의 메모리 요구 -> O(n)
