Feature: add product

  Scenario Outline: add products to shopping cart
    Given Since the user enters the Mundo Flor flower shop page
    When he selects category and product one and two
      | product1   | product2   |category|
      | <product1> | <product2> |<category>|
    Then he adds the products to the cart Carrito <message>
    Examples:
      | product1  | product2     | category| |message|
      | MDF 0001  | MDF 00010    | Amor |    |CARRITO|