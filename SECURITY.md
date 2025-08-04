# 🔒 Security Policy

## Supported Versions

The following table lists which versions of the Custom Annotations SDK are currently supported with security updates:

| Version | Supported          |
|---------|--------------------|
| 1.x     | ✅ Yes              |
| < 1.0   | ❌ No (pre-release) |

---

## 📬 Reporting a Vulnerability

If you discover a security vulnerability in this SDK, **please report it responsibly**.

### Contact

- Email: security@yourdomain.com  
- GitHub Issues: Please **do not** open security issues publicly. Use email instead.

We aim to respond to security reports within **72 hours**.

---

## 🧪 Security Practices

This project follows modern Kotlin security practices:

- No reflection-based execution outside unit tests  
- All annotations are `@Retention(AnnotationRetention.RUNTIME)` but non-invasive  
- The library does **not** access runtime system resources or unsafe operations  
- Tested under strict JVM flags for lint warnings and hidden API access

---

## ✅ Recommendations for Consumers

To improve your own security when using this SDK:

- Always pin a specific version in `build.gradle.kts`  
- Use `-Werror` for stricter compiler warnings  
- Keep Kotlin and Gradle versions up-to-date  
- Run static analysis (e.g., Detekt, Ktlint) on annotated usage

---

## 🔄 Disclosure Policy

All vulnerabilities will be:

1. Investigated and confirmed internally
2. Fixed in a patch/minor release within a reasonable timeframe
3. Disclosed via a GitHub release note, tagged commit, and this repository’s changelog

---

