Programowanie zespołowe laboratorium _**3**_ grupa _**3**_

# Dokumentacja projektu: **System do zarządzania zadaniami w centrum medycznym pomiędzy lekarzami a pacjentami

## Zespoł projektowy:

<ul>
<li>Karol Saj <b>(Team Leader)</b></li>
<li>Karol Wereski</li>
<li>Bartosz Słowik</li>
<li>Agata Sowa</li>
</ul>
## Opis programu / systemu


## Cel projektu 


## Zakres projektu 


## Wymagania stawiane aplikacji / systemowi 
- System powinien mieć kilka modułów 
  - Moduł administracji użytkownikami (role)
	  -  Grupa Administratorów
	  -  Grupa Lekarzy
	  -  Grupa Pacjentów
  - Moduł raportów 
	 -  Lekarz: Generowanie raportu Pacjenta
	 -  Lekarz/Administrator: Generowanie raportu użytkowników: przypisanych Lekarzy i Pacjentów
	 -  Generowanie raportów w formie PDF
  - Moduł konfiguracji
	  - Ustawienia paginacji
	  - Ustawienia Dark mode interfejsu użytkownika

- Aplikacja będzie wspópracować z bazą danych SQLite

## Panele / zakładki systemu, które będą oferowały potrzebne funkcjonalności 
- Panel administratora 
  - Główne narzędzie administratorów systemu umożliwiające wykonanie wszystkich czynności potrzebnych do zarządzania systemem np. dodawanie, edycja, usuwanie użytkowników, tworzenie i modyfikacja grup, zarządzanie innymi administratorami. 
- Panel innego użytkownika 
  - Funkcjonalność 1
  - ... kolejna funkcjonalność
...
- Zakładka raportów 
  - Generowanie raportów
- Zakładka ustawień 


## Typy wymaganych dokumentów w projekcie oraz dostęp do nich 
- Raporty PDF 
	 -  Administrator: Generowanie raportu użytkowników: przypisanych Lekarzy i Pacjentów
	 -  Lekarz/Administrator: Generowanie raportu Pacjenta
	 -  Generowanie raportów w formie PDF
- Inne dokumenty:
  - ...

## Przepływ informacji w środowisku systemu 
Scentralizowany oparty na bazie danych MySQL


## Interesariusze 
- Interesariusze wewnętrzni 
  - Lekarze, którzy używają aplikacji do zarządzania zadaniami pacjentów i komunikowania się z pacjentami
  - Administratorzy centrum medycznego do administrowania i kontroli działania placówki medycznej
- Interesariusze zewnętrzni 
  - Pacjenci, którzy używają aplikacji do zarządzania zadaniami związanymi z opieką zdrowotną i komunikowania się z lekarzami



## Użytkownicy aplikacji i ich uprawnienia 

### Pacjenci:

Przypadki użycia:

-   Przeglądanie nadchodzących wizyt
-   Wykonywanie przydzielonych zadań
-   Raportowanie stanu zdrowia do lekarzy
-   Otrzymywanie informacji zwrotnej i instrukcji od lekarzy

Działania:

1.  Przeglądanie wizyt: Pacjent sprawdza swój harmonogram wizyt, aby zobaczyć nadchodzące wizyty.
2.  Wykonywanie zadań: Pacjent wykonuje zadania przydzielone przez lekarza, takie jak wypełnianie formularzy zdrowotnych, zażywanie leków lub wykonywanie ćwiczeń.
3.  Raportowanie stanu zdrowia: Pacjent raportuje swoje zdrowie do lekarza na żądanie, takie jak zgłaszanie objawów lub postępu w leczeniu.
4.  Otrzymywanie informacji zwrotnej i instrukcji: Pacjent otrzymuje informacje zwrotne od lekarza na temat wykonanych zadań, a także instrukcje dotyczące nowych zadań lub zmian w leczeniu.

Sekwencje:

1.  Pacjent otrzymuje powiadomienie o nowym zadaniu przydzielonym przez lekarza.
2.  Pacjent przegląda szczegóły zadania i rozpoczyna jego wykonywanie.
3.  Pacjent aktualizuje stan zadania, dodaje wszelkie niezbędne uwagi lub komentarze.
4.  Pacjent wysyła wiadomości do lekarza, aby zgłosić problemy lub poprosić o pomoc.
5.  Lekarz przegląda stan zadania i udziela informacji zwrotnej lub dalszych instrukcji.
6.  Pacjent kończy zadanie i oznacza je jako wykonane.

### Lekarze:

Przypadki użycia:

-   Planowanie wizyt z pacjentami
-   Przydzielanie zadań pacjentom (takich jak wypełnianie formularzy zdrowotnych lub zażywanie leków)
-   Przeglądanie postępu i stanu zadań pacjentów
-   Komunikacja z pacjentami w sprawie zadań i wizyt

Działania:

1.  Planowanie wizyt: Lekarz tworzy nowe wizyty i umawia się na nie z pacjentami.
2.  Przydzielanie zadań: Lekarz przypisuje zadania do pacjentów na podstawie ich potrzeb medycznych, takich jak wypełnienie formularzy zdrowotnych, zażywanie leków lub wykonywanie ćwiczeń.
3.  Monitorowanie postępu zadań: Lekarz monitoruje postęp zadań pacjentów 

Sekwencje: 
1. Lekarz tworzy nowe zadanie i przydziela je pacjentowi.
2. Pacjent otrzymuje powiadomienie o nowym zadaniu i rozpoczyna nad nim pracę.
3. Pacjent aktualizuje status zadania.
4. Lekarz monitoruje postęp zadania
5. Pacjent wykonuje zadanie i zaznacza je jako wykonane.
6. Lekarz przegląda wykonane zadanie i przekazuje opinię/wnioski lub zatwierdzenie.


### Administrator:

Przypadki użycia:
-   Tworzenie/usuwanie/edycja pacjentów
-   Tworzenie/usuwanie/edycja lekarzy
-   Przeglądanie zadań lekarzy i pacjentów

Działania:
-   Rejestracja nowego pacjenta i przypisanie go do lekarza/lekarzy
-   Generowanie raportów istniejących pacjentów i przypisanych lekarzy
-   Generowanie pliku pdf z danymi zarejestrowanego użytkownika

Sekwencje: 
1. Administrator uzupełnia dane osobowe potencjalnego pacjenta i tworzy go.
2. Administrator przypisuje lekarza z listy lekarzy
3. Lekarz otrzymuje możliwość dopisywania wizyt i zadań do nowego użytkownika
4. Administrator generuje pliku pdf z danymi zarejestrowanego użytkownika wraz z hasłem
5. Pacjent otrzymuje dostęp do konta z danymi z wydrukowanego pliku pdf otrzymanego przez administratora


## Wymagania funkcjonalne

- Generowanie raportów w formie pdf
- Uwierzytelnianie za pomocą pary: login, hasło
- Podział na grupy użytkowników, zarządzany przez administratora
- System zakładek interfejsu użytkownika zgodny z określonymi przypadkami użycia i dostępnymi działaniami dla danej grupy użytkownika.


## Wymagania niefunkcjonalne

- Możliwość zmiany kolorystyki interfejsu na tzw. Dark mode 
- Wykorzystanie bazy danych MySQL i HibernateORM 
- Interfejs graficzny ma zostać wykonany w JavaFx 

## Diagramy UML
- ###### [Diagram przypadków użycia]
  Wstawić rys. diagramu UML
- ###### [Diagram aktywności]
Wstawić rys. diagramu UML
- ###### [Diagram sekwencji]
Wstawić rys. diagramu UML
- ###### [Diagram klas]
  Wstawić rys. diagramu UML

## Baza danych
###### Diagram ERD

###### Skrypt do utworzenia struktury bazy danych

###### Opis bazy danych

## Wykorzystane technologie 
- Język Java 17
  - JavaFX
  - Hibernate ORM
- Baza danych MySQL
- Inne z opisem

## Pliki instalacyjne wraz z opisem instalacji i konfiguracji wraz pierwszego uruchomienia
