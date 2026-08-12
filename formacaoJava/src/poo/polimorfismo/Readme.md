# 📢 Sistema de Notificações Multicanal (Java POO)

Este projeto foi desenvolvido em **Java** para praticar e demonstrar os dois tipos fundamentais de **Polimorfismo**: **Sobreposição (Overriding)** e **Sobrecarga (Overloading)**, além de conceitos avançados de desacoplamento de software.

---

## 📌 Conceitos de POO Aplicados

- **Polimorfismo de Sobreposição (`@Override`)**:
  - A superclasse abstrata `CanalNotificacao` define a assinatura do método abstrato `enviarMensagem(destinatario, mensagem)`.
  - As subclasses (`NotificacaoEmail`, `NotificacaoSMS` e `NotificacaoWhatsApp`) sobrescrevem esse método adaptando a mensagem para o seu canal.
- **Polimorfismo de Sobrecarga (Overloading)**:
  - A classe `GerenciadorDeNotificacoes` possui múltiplos métodos `disparar()` com o **mesmo nome**, mas com diferentes listas de parâmetros:
    1. `disparar(canal, destinatario, mensagem)` -> Envio imediato padrão.
    2. `disparar(canal, destinatario, mensagem, urgenteNivel)` -> Envio com flag de urgência.
    3. `disparar(canal, destinatario, mensagem, horarioAgendado)` -> Envio agendado com parsing de data/hora.
- **Manipulação de Data e Hora (`java.time`)**:
  - Uso de `LocalDateTime` e `DateTimeFormatter` (`dd/MM/yyyy HH:mm`) para formatar e validar os agendamentos.

---

## ⚙️ Arquitetura das Classes

```text
sistema.notificacoes.multicanal/
│
├── CanalNotificacao.java            # Classe abstrata mãe
├── NotificacaoEmail.java            # Subclasse com especificidades de e-mail (provedor)
├── NotificacaoSMS.java              # Subclasse com especificidades de SMS (operadora)
├── NotificacaoWhatsApp.java         # Subclasse com especificidades de Wpp (remetente)
├── GerenciadorDeNotificacoes.java   # Classe com métodos sobrecarregados (Overloading)
└── Sistema.java                     # Classe principal (main) para testes
