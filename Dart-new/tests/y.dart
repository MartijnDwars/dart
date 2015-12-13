func() {
  var conflictingName;
  conflictingName(p1) {}
}

main() {
  try {
    func();
  } catch(e) {}
}
