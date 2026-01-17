variable "ami_id" {
  description = "AMI ID for EC2"
  type        = string
  default     = "ami-0b46816ffa1234887"
}
 
variable "instance_type" {
  description = "EC2 instance type"
  type        = string
  default     = "t3.micro"
}
 
variable "key_name" {
  description = "EC2 Key Pair name"
  type        = string
  default = "FirstCloud"
}