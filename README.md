# Dart

This is an implementation of Dart in Spoofax. Currently, the syntax can be parsed and there is some name binding and type analysis. However, there are no custom constraints yet.

## Spec

The grammar that was used to implement the syntax can be found in `DartSpec/tests/dartLangSpec.tex`. This is essentially a cleaned version of the ECMA-408 specification.

## Tests

The tests can be found in `Dart/tests/` and are mostly syntactic (~200). However, the preferred way of executing tests is by plugging the generated JSGLR parser into Dart's own test runner. DartParser forms an adapter to enable this.

