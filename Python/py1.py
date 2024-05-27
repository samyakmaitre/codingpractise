# # Task 11: Simulate Elliptical Orbits in Pygame

# import pygame
# import math

# # Initialize Pygame
# pygame.init()

# # Set up the display
# width, height = 800, 600
# screen = pygame.display.set_mode((width, height))
# pygame.display.set_caption("Elliptical Orbit Simulation")

# # Colors
# WHITE = (255, 255, 255)
# BLACK = (0, 0, 0)

# # Constants for the ellipse
# a = 200  # Semi-major axis
# b = 100  # Semi-minor axis
# center = (width // 2, height // 2)  # Center of the ellipse
# angle = 0  # Initial angle

# # Main loop
# running = True
# while running:
#     screen.fill(BLACK)
#     for event in pygame.event.get():
#         if event.type == pygame.QUIT:
#             running = False

#     # Calculate position on ellipse
#     x = center[0] + a * math.cos(math.radians(angle))
#     y = center[1] + b * math.sin(math.radians(angle))

#     # Draw the ellipse
#     pygame.draw.ellipse(screen, WHITE, [center[0] - a, center[1] - b, 2 * a, 2 * b], 1)

#     # Draw the object (point) moving along the ellipse
#     pygame.draw.circle(screen, WHITE, (int(x), int(y)), 5)

#     # Increment angle for animation
#     angle += 1
#     if angle >= 360:
#         angle = 0

#     pygame.display.flip()

# # Quit Pygame
# pygame.quit()


def add(int a , int b){
    return a+b;
}