void main() {
  Idol blackPink = Idol();
  
  print(blackPink.name);
  print(blackPink.members);
  blackPink.sayHello();
  blackPink.introduce();
}

// Idol class
// name (이름) - 변수
// members (멤버들) - 변수
// sayHello (인사) - 함수
// introduce (맴버소개) - 함수
class Idol {
  String name = '블랙핑크';
  List<String> members = ['지수', '제니', '리사', '로제'];
  
  void sayHello() {
    print('안녕하세요 블랙핑크입니다.');
  }
  
  void introduce() {
    print('저희 맴버는 지수, 제니, 리사, 로제가 있습니다.');
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
  void main() {
  Idol blackPink = Idol(
    '블랙핑크',
    ['지수', '제니', '리사', '로제']
  );
  
  print(blackPink.name);
  print(blackPink.members);
  blackPink.sayHello();
  blackPink.introduce();
}

// Idol class
// name (이름) - 변수
// members (멤버들) - 변수
// sayHello (인사) - 함수
// introduce (맴버소개) - 함수

// constructor(생성자)
class Idol {
  String name;
  List<String> members;
  
  Idol(String name, List<String> members)
    : this.name = name,
      this.members = members;
  
  void sayHello() {
    print('안녕하세요 블랙핑크입니다.');
  }
  
  void introduce() {
    print('저희 맴버는 지수, 제니, 리사, 로제가 있습니다.');
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  Idol blackPink = Idol(
    '블랙핑크',
    ['지수', '제니', '리사', '로제']
  );
  
  print(blackPink.name);
  print(blackPink.members);
  blackPink.sayHello();
  blackPink.introduce();
}

// Idol class
// name (이름) - 변수
// members (멤버들) - 변수
// sayHello (인사) - 함수
// introduce (맴버소개) - 함수

// constructor(생성자)
class Idol {
  String name;
  List<String> members;
  
  Idol(this.name, this.members);

  

  void sayHello() {
    print('안녕하세요 ${this.name}입니다.');
  }
  
  void introduce() {
    print('저희 맴버는 ${this.members}가 있습니다.');
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  Idol blackPink = Idol(
    '블랙핑크',
    ['지수', '제니', '리사', '로제']
  );
  
  print(blackPink.name);
  print(blackPink.members);
  blackPink.sayHello();
  blackPink.introduce();
  
  Idol bts = Idol.fromList(
    [
      ['RM', '진', '슈가', '제이홉', '지민', '뷔', '정국'],
      'BTS',
      ]
  );
  
  print(bts.name);
  print(bts.members);
  bts.sayHello();
  bts.introduce();
}

// Idol class
// name (이름) - 변수
// members (멤버들) - 변수
// sayHello (인사) - 함수
// introduce (맴버소개) - 함수

// constructor(생성자)
class Idol {
  String name;
  List<String> members;
  
  Idol(this.name, this.members);

  Idol.fromList(List values)
    : this.members = values[0],
      this.name = values[1];
  
  void sayHello() {
    print('안녕하세요 ${this.name}입니다.');
  }
  
  void introduce() {
    print('저희 맴버는 ${this.members}가 있습니다.');
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  // const 넣지 않고 같은 값의 클래스 변수를 만들면 다른 변수로 인지
  // const 넣고 같은 같은 값의 클래스 변수를 만들면 같은 변수로 인지 
  Idol blackPink = Idol(
    '블랙핑크',
    ['지수', '제니', '리사', '로제']
  );
  
  Idol bts = Idol.fromList(
    [
      ['RM', '진', '슈가', '제이홉', '지민', '뷔', '정국'],
      'BTS',
      ]
  );
  
  print(blackPink.firstMember);
  print(bts.firstMember);
  
  blackPink.firstMember = '코드팩토리';
  bts.firstMember = '아이언맨';
  
  print(blackPink.firstMember);
  print(bts.firstMember);
}

// Idol class
// name (이름) - 변수
// members (멤버들) - 변수
// sayHello (인사) - 함수
// introduce (맴버소개) - 함수

// constructor(생성자)
class Idol {
  String name;
  List<String> members;
  
  Idol(this.name, this.members);

  Idol.fromList(List values)
    : this.members = values[0],
      this.name = values[1];
  
  void sayHello() {
    print('안녕하세요 ${this.name}입니다.');
  }
  
  void introduce() {
    print('저희 맴버는 ${this.members}가 있습니다.');
  }
  
  // getter
  String get firstMember {
    return this.members[0];
  }
  
  
  //setter
  set firstMember(String name) {
    this.members[0] = name;
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
// private 속성걸기 '_'
class _Idol {
  
}

------------------------------------------------------------------------------------------------------------------------------------------------------
// 자식 클래스에 있는 속성들은 부모 클래스에서 쓸 수 없고 같은 부모 클래스의 다른 자식 클래스에서도 쓸 수 없
void main() {
  print('-------- Idol --------');
  Idol apink = Idol(name: '에이핑크', membersCount:5);
  
  apink.sayName();
  apink.sayMembersCount();
  
  
  BoyGroup bts = BoyGroup('BTS', 7);
  
  bts.sayMembersCount();
  bts.sayName();
  bts.sayMale();
}

// 상속 - inheritance
// 상속을 받으면 부모 클래스의 모든 속성을 자식 클래스가 부여받는다.
class Idol{
  String name;
  int membersCount;
  
  Idol({
    required this.name,
    required this.membersCount,
  });
  
  void sayName() {
    print('저는 ${this.name}입니다.');
  }
  
  void sayMembersCount() {
    print('${this.name}은 ${this.membersCount}명의 맴버가 있습니다.');
  }
}

class BoyGroup extends Idol {
  BoyGroup(
    String name,
    int membersCount,
  ): super(
    name: name,
    membersCount: membersCount
    );
  
  void sayMale() {
    print('저는 남자 아이돌입니다.');
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  print('-------- Idol --------');
  Idol apink = Idol(name: '에이핑크', membersCount:5);
  
  apink.sayName();
  apink.sayMembersCount();
  
  
  BoyGroup bts = BoyGroup('BTS', 7);
  
  bts.sayMembersCount();
  bts.sayName();
  bts.sayMale();
  
  GirlGroup redVelvet = GirlGroup('Red Velvet', 5);
  redVelvet.sayMembersCount();
  redVelvet.sayName();
  redVelvet.sayFemale();
  
  print(apink is Idol); // true
  print(apink is BoyGroup); // false
  print(apink is GirlGroup); // false
  
  print(bts is Idol); // true
  print(bts is BoyGroup); // true
  print(bts is GirlGroup); // false
  
  print(redVelvet is Idol); // true
  print(redVelvet is BoyGroup); // false
  print(redVelvet is GirlGroup); // true
}

// 상속 - inheritance
// 상속을 받으면 부모 클래스의 모든 속성을 자식 클래스가 부여받는다.
class Idol{
  String name;
  int membersCount;
  
  Idol({
    required this.name,
    required this.membersCount,
  });
  
  void sayName() {
    print('저는 ${this.name}입니다.');
  }
  
  void sayMembersCount() {
    print('${this.name}은 ${this.membersCount}명의 맴버가 있습니다.');
  }
}

class BoyGroup extends Idol {
  BoyGroup(
    String name,
    int membersCount,
  ): super(
    name: name,
    membersCount: membersCount
    );
  
  void sayMale() {
    print('저는 남자 아이돌입니다.');
  }
}

class GirlGroup extends Idol {
  GirlGroup(
  String name,
    int membersCount,
  ): super(
    name: name,
    membersCount: membersCount
    );
  
  void sayFemale() {
    print('저는 여자 아이돌입니다.');
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  TimesTwo tt = TimesTwo(2);
  
  print(tt.calculate());
  
  TimesFour tf = TimesFour(2);
  
  print(tf.calculate());
}

// method - function (class 내부에 있는 함수)
// override - 덮어쓰다 (우선시하다)
class TimesTwo {
  final int number;
  
  TimesTwo(
    this.number,
  );
  
  // method
  int calculate() {
    return number * 2;
  }
}

class TimesFour extends TimesTwo{
  TimesFour(
    int number,
  ) : super(number);
  
  @override
  int calculate() {
    // return super.number * 4;
    return super.calculate() * 2;
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  Employee seulgi = Employee('슬기');
  Employee chorong = Employee('초롱');
  Employee jenny = Employee('제니');
  
  seulgi.name = '코드펙토리';
  seulgi.printNameAndBuilding();
  chorong.printNameAndBuilding();
  
  Employee.building = '오투타워';
  
  seulgi.printNameAndBuilding();
  chorong.printNameAndBuilding();
  jenny.printNameAndBuilding();
  
  Employee.printBuilding();
}

class Employee {
  // static은 instance에 귀속되지 않고 class에 귀속된다,
  // 알바생이 일하고 있는 건물
  static String? building;
  
  String name;
  
  Employee(
    this.name,
  );
  
  void printNameAndBuilding() {
    print('제 이름은 $name입니다. $building 건물에서 근무하고 있습니다.');
  }
  
  static void printBuilding() {
    print('저는 $building 건물에서 근무중입니다,');
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  BoyGroup bts = BoyGroup('BTS');
  GirlGroup redVelvet = GirlGroup('레드벨벳');
  
  bts.sayName();
  redVelvet.sayName();
  
  print(bts is IdolInterface); // true
  print(bts is BoyGroup); // true
  print(bts is GirlGroup); // false
  
  print(redVelvet is IdolInterface); // true
  print(redVelvet is BoyGroup); // false
  print(redVelvet is GirlGroup); // true
}

// interface
abstract class IdolInterface {
  String name;
  
  IdolInterface(this.name);
  
  void sayName() {
    
  }
}

class BoyGroup implements IdolInterface {
  String name;
  
  BoyGroup(this.name);
  
  void sayName() {
    print('제 이름은 $name입니다.');
  }
}

class GirlGroup implements IdolInterface {
  String name;
  
  GirlGroup (this.name);
  
  void sayName() {
    print('제 이름은 $name입니다.');
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  Lecture<String, String> lecture1 = Lecture('123', 'lecture1');
  
  lecture1.printIdType();
  
  Lecture<int, String> lecture2 = Lecture(123, 'lecture2');
  
  lecture2.printIdType();
}

// generic - 타입을 외부에서 받을 때 사용
class Lecture<T, X> {
  final T id;
  final X name;
  
  Lecture(this.id, this.name);
  
  void printIdType() {
    print(id.runtimeType);
  }
}

------------------------------------------------------------------------------------------------------------------------------------------------------
void main() {
  Test test = Test();
  
  test.
}

// Object Oriented Programming (OOP)
// 객체지향 프로그래밍
// 모든 클래스가 object를 상속받고 있음
// class Test extends Object{}
class Test {}
