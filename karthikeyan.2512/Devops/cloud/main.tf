terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 4.0"
    }
  }
}
 
provider "aws" {
  region = "eu-north-1"   
}

 
resource "aws_instance" "FirstCloud" {
  ami           = var.ami_id
  instance_type = var.instance_type
  key_name      = var.key_name
 
  tags = {
    Name = "Terraform-EC2-Demo"
  }
}