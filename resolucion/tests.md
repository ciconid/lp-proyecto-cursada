# Casos de Prueba - Cobertura de Caminos

## Valores de Entrada

| Test | input1 | input2 | Descripción |
|------|--------|--------|-------------|
| 1 | 5 | 3 | Camino completo con if TRUE y límite pequeño |
| 2 | -5 | 3 | x negativo (no ejecuta calcular) |
| 3 | 0 | 0 | x = 0 (caso borde) |
| 4 | 100 | -10 | y >= 100 (no ejecuta calcular) |
| 5 | 50 | -50 | Ambas condiciones FALSE |
| 6 | 30 | 30 | Break en calcular (resultado >= 1000) |
| 7 | 100 | 50 | Límite grande con break |
| 8 | 1 | 1 | Valores positivos pequeños |
| 9 | 50 | -49 | y en el límite (99) |
| 10 | -100 | -50 | Valores negativos grandes |

---

## Casos de Prueba por Caminos (Detallado)

### **Test 1: Camino completo con if TRUE y límite pequeño**
**Inputs:** `5 3`
- x = 8, y = 2
- ✓ `x > 0 && y < 100` → TRUE → ejecuta `calcular(10)`
- ✓ `procesarSimple(8)` → `x > 0` → TRUE → modifica multiplicador
- ✓ `calcular(10)` → límite pequeño, no hace break

---

### **Test 2: x negativo (no ejecuta calcular)**
**Inputs:** `-5 3`
- x = -2, y = -8
- ✗ `x > 0 && y < 100` → FALSE (x <= 0) → NO ejecuta calcular
- ✗ `procesarSimple(-2)` → `x <= 0` → FALSE → usa rama else

---

### **Test 3: x = 0 (caso borde)**
**Inputs:** `0 0`
- x = 0, y = 0
- ✗ `x > 0 && y < 100` → FALSE (x no es > 0)
- ✗ `procesarSimple(0)` → `x <= 0` → FALSE
- No se ejecuta `calcular`

---

### **Test 4: y >= 100 (no ejecuta calcular)**
**Inputs:** `100 -10`
- x = 90, y = 110
- ✗ `x > 0 && y < 100` → FALSE (y >= 100) → NO ejecuta calcular
- ✓ `procesarSimple(90)` → `x > 0` → TRUE

---

### **Test 5: Ambas condiciones FALSE pero por y = 100 exacto**
**Inputs:** `50 -50`
- x = 0, y = 100
- ✗ `x > 0 && y < 100` → FALSE (ambas condiciones fallan)
- ✗ `procesarSimple(0)` → `x <= 0` → FALSE

---

### **Test 6: Break en calcular (resultado >= 1000)**
**Inputs:** `30 30`
- x = 60, y = 0
- ✓ `x > 0 && y < 100` → TRUE → ejecuta `calcular(60)`
- ✓ `procesarSimple(60)` → `x > 0` → TRUE
- ✓ `calcular(60)` → con factorGlobal=10, llega a 1000 y hace break

---

### **Test 7: Límite grande con break**
**Inputs:** `100 50`
- x = 150, y = 50
- ✓ `x > 0 && y < 100` → TRUE → ejecuta `calcular(200)`
- ✓ `procesarSimple(150)` → `x > 0` → TRUE
- ✓ `calcular(200)` → break por resultado >= 1000

---

### **Test 8: Valores positivos pequeños**
**Inputs:** `1 1`
- x = 2, y = 0
- ✓ `x > 0 && y < 100` → TRUE → ejecuta `calcular(2)`
- ✓ `procesarSimple(2)` → `x > 0` → TRUE
- ✓ `calcular(2)` → solo 2 iteraciones

---

### **Test 9: y en el límite (99)**
**Inputs:** `50 -49`
- x = 1, y = 99
- ✓ `x > 0 && y < 100` → TRUE (y = 99 < 100)
- ✓ `procesarSimple(1)` → `x > 0` → TRUE
- ✓ `calcular(100)` → break seguro

---

### **Test 10: Valores negativos grandes**
**Inputs:** `-100 -50`
- x = -150, y = -50
- ✗ `x > 0 && y < 100` → FALSE (x negativo)
- ✗ `procesarSimple(-150)` → `x <= 0` → FALSE

---

## Resumen de Cobertura

| Camino | Tests que lo cubren |
|--------|---------------------|
| **procesarComplejo**: `x > 0 && y < 100` = TRUE | 1, 6, 7, 8, 9 |
| **procesarComplejo**: `x > 0 && y < 100` = FALSE | 2, 3, 4, 5, 10 |
| **procesarSimple**: `x > 0` = TRUE | 1, 4, 6, 7, 8, 9 |
| **procesarSimple**: `x <= 0` = FALSE | 2, 3, 5, 10 |
| **calcular**: con break (`resultado >= 1000`) | 6, 7, 9 |
| **calcular**: sin break (límite pequeño) | 1, 8 |
| **calcular**: no se ejecuta | 2, 3, 4, 5, 10 |

---

## Notas

- Los valores de `x` e `y` en `procesarComplejo` se calculan como:
  - `x = input1 + input2`
  - `y = input1 - input2`
- `factorGlobal` tiene valor inicial de `10`
- El break en `calcular` ocurre cuando `resultado >= 1000`
- Estos 10 casos cubren todas las combinaciones de caminos posibles en el código Java
