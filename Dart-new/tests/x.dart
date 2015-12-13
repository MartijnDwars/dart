class A {
  method() {
    {
      var i;
    }

    for (var i = 0; i < 10; i++) {}

    void f(i) {}
  }
}

main() {
  l() {
    var local;
  };
  {
    var local = 1;
  }
}
