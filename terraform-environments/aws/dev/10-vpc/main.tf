locals {
  aws_region       = "us-east-1"
  environment_name = "dev"
  tags = {
    ops_env              = "${local.environment_name}"
    ops_managed_by       = "terraform",
    ops_source_repo      = "awsdemo",
    ops_source_repo_path = "terraform-environments/aws/${local.environment_name}/10-vpc",
    ops_owners           = "devops",
  }
}


terraform {
  cloud {
    # Update to your Terraform Cloud organization
    organization = "thothit-org"
    workspaces {
      name = "kubernetes-ops-staging-10-vpc"
    }
    token = "9hAX79ykMcKZ3A.atlasv1.QlgQoU6qpGyw2yW3phvwDDlhi6g08jATdUDJ8lQcYLABbBWqQXnUHz8rm7br6Wcly2c"
  }
  required_providers {
    aws = {
      source     = "hashicorp/aws"
      version    = ">= 3.37.0"
    }
  }
}

provider "aws" {
  region = local.aws_region
}

#
# VPC
#
module "vpc" {
  source = "github.com/ManagedKube/kubernetes-ops//terraform-modules/aws/vpc?ref=v1.0.30"

  aws_region       = local.aws_region
  azs              = ["us-east-1a", "us-east-1c", "us-east-1d"]
  vpc_cidr         = "10.0.0.0/16"
  private_subnets  = ["10.0.1.0/24", "10.0.2.0/24", "10.0.3.0/24"]
  public_subnets   = ["10.0.101.0/24", "10.0.102.0/24", "10.0.103.0/24"]
  environment_name = local.environment_name
  cluster_name     = local.environment_name
  tags             = local.tags
}
