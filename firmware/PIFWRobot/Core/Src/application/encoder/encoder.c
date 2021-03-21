/*
 * Encoder.c
 *
 *  Created on: Dec 17, 2019
 *      Author: 16138
 */

#include <application/encoder/encoder.h>
#include <application/params/params.h>
#include <application/timer/timer.h>
#include <application/user_define.h>
#include "tim.h"

#if MOTOR_TYPE==0

typedef int16_t (*enc_read_t)(motors_t motor); // int16_t (*)(motors_t)

static int16_t enc_read_0(motors_t motor);
static int16_t enc_read_1(motors_t motor);

static int16_t 	  	m0_speed=0, m1_speed=0;
static enc_read_t 	genc_read = 0;
static timer_id_t 	genc_id;
static bool 		ginitialized = false;

static void enc_callback(void *ctx){
	m0_speed = MOTOR0_ENCODER.Instance->CNT;
	MOTOR0_ENCODER.Instance->CNT = 0;

	m1_speed = MOTOR1_ENCODER.Instance->CNT;
	MOTOR1_ENCODER.Instance->CNT = 0;
}

int enc_init(){
	if(ginitialized) return 0;

	HAL_TIM_Encoder_Start(&MOTOR0_ENCODER,TIM_CHANNEL_ALL);
	HAL_TIM_Encoder_Start(&MOTOR1_ENCODER,TIM_CHANNEL_ALL);
	MOTOR0_ENCODER.Instance->CNT = 0;
	MOTOR1_ENCODER.Instance->CNT = 0;

	if(params.encoder_exchange) genc_read = enc_read_0;
	else genc_read = enc_read_1;

	genc_id = timer_register_callback(enc_callback, ENC_PERIOD, 0, TIMER_MODE_REPEAT);

	ginitialized = true;
	return 0;
}

int enc_deinit(){
	timer_unregister_callback(genc_id);
	ginitialized = false;
	return 0;
}

int16_t enc_read(motors_t motor){
	return genc_read(motor);
}

static int16_t enc_read_0(motors_t motor){
	switch(motor){
	case MOTOR_0:
		if(params.encoder0_invert) return -m0_speed;
		else return m0_speed;
		break;
	case MOTOR_1:
		if(params.encoder1_invert) return -m1_speed;
		else return m1_speed;
		break;
	}
	return 0;
}

static int16_t enc_read_1(motors_t motor){
	switch(motor){
	case MOTOR_0:
		if(params.encoder0_invert) return -m1_speed;
		else return m1_speed;
		break;
	case MOTOR_1:
		if(params.encoder1_invert) return -m0_speed;
		else return m0_speed;
		break;
	}
	return 0;
}

#endif
