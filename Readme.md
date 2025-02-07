

🚨 Errata intencional:
👉 Supongamos que alguien malinterpreta la condición y piensa que debería ser i <= stops.length en lugar de i < stops.length.
❌ Esto generaría un error en tiempo de ejecución cuando i sea igual a stops.length, porque los índices en un array van de 0 a length - 1.

❌ Unclear class and method names: T instead of TripTest, t() instead of testTravelTime().
❌ Inconsistent variable naming: d, s, p, and n are cryptic and hard to understand.
❌ Magic numbers: No explanation for 6.25, making it hard to verify correctness.
❌ Poor formatting and lack of comments: No readability, making maintenance difficult.
