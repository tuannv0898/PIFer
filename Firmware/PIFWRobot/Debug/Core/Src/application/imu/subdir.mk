################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../Core/Src/application/imu/imu.c 

OBJS += \
./Core/Src/application/imu/imu.o 

C_DEPS += \
./Core/Src/application/imu/imu.d 


# Each subdirectory must supply rules for building sources it contributes
Core/Src/application/imu/imu.o: ../Core/Src/application/imu/imu.c
	arm-none-eabi-gcc "$<" -mcpu=cortex-m3 -std=gnu11 -g3 -DUSE_HAL_DRIVER -DSTM32F103xB -DDEBUG -c -I../Core/Inc -I../Drivers/STM32F1xx_HAL_Driver/Inc -I../Drivers/STM32F1xx_HAL_Driver/Inc/Legacy -I../Drivers/CMSIS/Device/ST/STM32F1xx/Include -I../Drivers/CMSIS/Include -I"D:/Projects/PIFWRobot/firmware/PIFWRobot/Core/Src" -O0 -ffunction-sections -fdata-sections -Wall -fstack-usage -MMD -MP -MF"Core/Src/application/imu/imu.d" -MT"$@" --specs=nano.specs -mfloat-abi=soft -mthumb -o "$@"
