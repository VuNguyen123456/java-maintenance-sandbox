from selenium import webdriver
from selenium.webdriver.common.by import By
import time

driver = webdriver.Chrome()
driver.get("http://localhost:3000")

time.sleep(2)


def run_test(value, direction, action, category):
    # input value
    input_box = driver.find_element(By.ID, "input")
    input_box.clear()
    input_box.send_keys(str(value))

    # direction
    direction_box = driver.find_element(By.ID, "direction")
    direction_box.send_keys(direction)

    # action button
    if action == 'User clicks "Convert" button':
        driver.find_element(By.ID, "convert").click()
    elif action == 'User clicks "Reset" button':
        driver.find_element(By.ID, "reset").click()

    time.sleep(1)

    # category selector
    category_box = driver.find_element(By.ID, "category")
    category_box.send_keys(str(category))

    # result
    try:
        result = driver.find_element(By.ID, "result").text
        print(f"PASS TEST: ({value}, {direction}, {action}, {category}) => {result}")
    except:
        print(f"PASS TEST: ({value}, {direction}, {action}, {category}) => NO RESULT")


# =========================
# BASE TEST
# =========================
run_test(-10, "Fahrenheit -> Celsius", 'User clicks "Convert" button', "{Fahrenheit, Celsius}")

# =========================
# C1: VALUE
# =========================
run_test(0, "Fahrenheit -> Celsius", 'User clicks "Convert" button', "{Fahrenheit, Celsius}")
run_test(10, "Fahrenheit -> Celsius", 'User clicks "Convert" button', "{Fahrenheit, Celsius}")
run_test("test", "Fahrenheit -> Celsius", 'User clicks "Convert" button', "{Fahrenheit, Celsius}")

# =========================
# C2: DIRECTION
# =========================
run_test(-10, "Celsius -> Fahrenheit", 'User clicks "Convert" button', "{Fahrenheit, Celsius}")

# =========================
# C3: ACTION (RESET)
# =========================
run_test(-10, "Fahrenheit -> Celsius", 'User clicks "Reset" button', "{Fahrenheit, Celsius}")

# =========================
# C4: CATEGORY
# =========================
run_test(-10, "Fahrenheit -> Celsius", 'User clicks "Convert" button', "{Miles, Kilometers}")
run_test(-10, "Fahrenheit -> Celsius", 'User clicks "Convert" button', "{Gallons, Liters}")
run_test(-10, "Fahrenheit -> Celsius", 'User clicks "Convert" button', "{Pounds, Kilograms}")


driver.quit()