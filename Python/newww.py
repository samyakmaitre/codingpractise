# Dining Philosopher Problem using Semaphores

from threading import Thread, Semaphore
import time
import random

NUM_PHILOSOPHERS = 5
chopsticks = [Semaphore(1) for _ in range(NUM_PHILOSOPHERS)]

def philosopher(pid):
    while True:
        print(f"Philosopher {pid} is thinking.")
        time.sleep(random.uniform(1, 3))
        print(f"Philosopher {pid} is hungry.")
        eat(pid)

def eat(pid):
    left_chopstick = pid
    right_chopstick = (pid + 1) % NUM_PHILOSOPHERS

    chopsticks[left_chopstick].acquire()
    chopsticks[right_chopstick].acquire()

    print(f"Philosopher {pid} is eating.")
    time.sleep(random.uniform(1, 3))

    chopsticks[left_chopstick].release()
    chopsticks[right_chopstick].release()

    print(f"Philosopher {pid} finished eating.")

if __name__ == "__main__":
    philosophers = [Thread(target=philosopher, args=(i,)) for i in range(NUM_PHILOSOPHERS)]
    
    for p in philosophers:
        p.start()
    
    for p in philosophers:
        p.join()
