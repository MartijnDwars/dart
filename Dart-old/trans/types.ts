module types

imports
  
  include/Dart
  trans/signatures
  
relations

  define reflexive <:
  
type rules
  
  Class(_, _, name, _, Parent(parent), _, _, _):-
    where store Type(name) <: parent
  
  NewObject(Type(t), _): Type(t)
  
  TypeCast(_, t): t
  
  Call(e, _): t
    where e: t
  
  VarRef(x): t
    where definition of x: t
    
    
type rules // Primitives
  
  String(_): StringType()
  
  Dec(_): IntType()
  
  True(): BoolType()
  
  False(): BoolType()
  
  List(_, _): ListType()
  
  Map(_, _): MapType()
  
  // TODO: Type of unary and binary expressions. But these need to take operator overriding into account.
  