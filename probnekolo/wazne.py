__lt__(self, other)	<
__le__(self, other)	<=
__eq__(self, other)	==
__ne__(self, other)	!=
__gt__(self, other)	>
__ge__(self, other)	>=
__add__(self, other)	+
__sub__(self, other)	–
__mul__(self, other)	*
# Metoda hasattr()zwraca true, jeśli obiekt ma podany atrybut nazwany, a false, jeśli go nie ma.
#
# Przykład
# class Person:
#     age = 23
#     name = "Adam"
#
# person = Person()
#
# print("Person's age:", hasattr(person, "age"))
# print("Person's salary:", hasattr(person, "salary"))
#
# # Output:
# # Person's age: True
# # Person's salary: False

# dowolna liczbe argumentów nazwanych **kwargs
# dowolna liczbe argumentów nienazwanych *args

# # mnozenie
#     def __mul__(self, other):
#         return Wymierna(self.licznik * other.licznik, self.mianownik * other.mianownik)
# # dzielenie
#     def __div__(self, other):
#         return Wymierna(self.licznik * other.mianownik, self.mianownik * other.licznik)

#przestrzen nazw __dict__
